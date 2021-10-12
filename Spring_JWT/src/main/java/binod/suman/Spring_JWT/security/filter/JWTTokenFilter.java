package binod.suman.Spring_JWT.security.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import binod.suman.Spring_JWT.util.JWTUtil;

@Component
public class JWTTokenFilter extends OncePerRequestFilter{

	@Autowired
	private JWTUtil jwtUtil;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String token = jwtUtil.resolveToken(request);
		
		try {
			if (token != null && jwtUtil.validateToken(token)) {
				
				Authentication auth = jwtUtil.getAuthentication(token);
			    SecurityContextHolder.getContext().setAuthentication(auth);
				
			}
		} catch (Exception ex) {
			SecurityContextHolder.clearContext();
		    response.sendError(HttpStatus.FORBIDDEN.value(), ex.getMessage());
	
		}
		filterChain.doFilter(request, response);
	}

}
