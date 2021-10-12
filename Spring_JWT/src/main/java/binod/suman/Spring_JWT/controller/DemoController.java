package binod.suman.Spring_JWT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import binod.suman.Spring_JWT.controller.entity.CredentialRequest;
import binod.suman.Spring_JWT.util.JWTUtil;

@RestController
public class DemoController {

	
	@Autowired
	private JWTUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	@GetMapping("/home")
	public String home() {
		return "Thsi is Home Page";
	}
	
	@GetMapping("/cat")
	public String catalog() {
		return "Thsi is Catalog Page";
	}
	
	@GetMapping("/purchase")
	public String purchase() {
		return "Thsi is purchase Page";
	}
	
	// Permit this API and use configure method in securityconfig.
		@PostMapping("/auth")
		public String getToken(@RequestBody CredentialRequest credentialRequest) throws Exception{
			try {
			UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(credentialRequest.getUserName(), credentialRequest.getPassword());
			authenticationManager.authenticate(authentication);
			}catch(Exception e) {
				throw new Exception("Plase check entered credential");
			}
			return jwtUtil.generateToken(credentialRequest.getUserName());
		}
}
