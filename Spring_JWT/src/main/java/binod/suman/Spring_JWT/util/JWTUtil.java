package binod.suman.Spring_JWT.util;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import binod.suman.Spring_JWT.service.UserInfoService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil implements Serializable{

	@Autowired
	private UserInfoService userInfoService;
	
	private static final long serialVersionUID = -3770750193110709435L;
	public static final long validityInMilliseconds = 60 * 1000 * 60 * 1; // 1 Hour
	private String secretKey = "justfordemo";
	
	public String generateToken(String userName) {
		
		Claims claims = Jwts.claims().setSubject(userName);
		Date now = new Date();
		Date validity = new Date(now.getTime() + validityInMilliseconds);
        return Jwts.builder()
        		   .setClaims(claims)
        		   .setIssuedAt(now)
        		   .setExpiration(validity)
        		   .signWith(SignatureAlgorithm.HS256, secretKey)
        		   .compact();
		
	}
	
	public String getUserName(String token) {
    	return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
    }
	
	private Boolean isTokenExpired(String token) {
    	Date tokenExpireDate =  Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getExpiration();
        return tokenExpireDate.before(new Date());
    }
	
	public boolean validateToken(String token) throws Exception {
        try {
          Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
          return true;
        } catch (JwtException | IllegalArgumentException e) {
          throw new Exception("Expired or invalid JWT token"+ HttpStatus.INTERNAL_SERVER_ERROR);
        }
      }
	
	
	public String resolveToken(HttpServletRequest req) {
        String bearerToken = req.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
          return bearerToken.substring(7); // Size of "Bearer " is 7.
        }
        return null;
      }

    public Authentication getAuthentication(String token) {
        UserDetails userDetails = userInfoService.loadUserByUsername(getUserName(token));
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
      }
    
}
