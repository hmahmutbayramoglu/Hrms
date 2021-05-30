package Waps.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Waps.hrms.business.abstracts.AuthService;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.entities.concretes.Candidate;
import Waps.hrms.entities.concretes.Employer;
 

@RestController
@RequestMapping("/api/auths")
public class AuthsController {
	
	private AuthService authService;
	
	@Autowired
	public AuthsController(AuthService authService) {
		
		super();
		this.authService = authService;
	}
	
	
	@PostMapping("/registerCandidate")
	public 	Result registerCandidate(@RequestBody Candidate candidate){
 
		return this.authService.registerCandidate(candidate);
			
	}
	
	@PostMapping("/registerEmployer")
	public 	Result registerEmployer(@RequestBody Employer employer){
 
		return this.authService.registerEmployer(employer);
			
	}
	

}
