package com.customer.jwt;


import java.io.IOException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.customer.security.CustomerLoginDetails;
import com.customer.security.CustomerLoginDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtills jwtUtills;

	@Autowired
	private CustomerLoginDetailsService customerLoginDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String auth = request.getHeader("Authorization");
		String token = null;
		String email = null;
		if (auth != null && auth.startsWith("Bearer")) {
			token = auth.substring(6);
			email = jwtUtills.getUsernameFromToken(token);
		}

		if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			CustomerLoginDetails currentUser = (CustomerLoginDetails) customerLoginDetailsService.loadUserByUsername(email);

			UsernamePasswordAuthenticationToken userAuthToken = new UsernamePasswordAuthenticationToken(currentUser,
					null, currentUser.getAuthorities());
			userAuthToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			SecurityContextHolder.getContext().setAuthentication(userAuthToken);
		}

		filterChain.doFilter(request, response);

	}

}