package Waps.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.AuthService;
import Waps.hrms.business.abstracts.CandidateService;
import Waps.hrms.business.abstracts.EmployerService;
import Waps.hrms.core.utilities.adapters.email.EmailValidatorService;
import Waps.hrms.core.utilities.results.ErrorResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.core.utilities.results.SuccessResult;
import Waps.hrms.entities.concretes.Candidate;
import Waps.hrms.entities.concretes.Employer;

@Service
public class AuthManager implements AuthService{
	
	private EmployerService employerService;
	private CandidateService candidateService;
	private EmailValidatorService emailValidatorService;
	
	
	@Autowired
	public AuthManager(
			CandidateService candidateService, 
			EmployerService employerService,
			EmailValidatorService emailValidatorService) {
		
		super();
		this.candidateService = candidateService;
		this.employerService = employerService;
		this.emailValidatorService = emailValidatorService;
	}

	@Override
	public Result registerCandidate(Candidate candidate) {
		
	 	 
	 
		if(!this.candidateService.add(candidate).isSuccess()) {
			return new ErrorResult("Candidate registration not successful :(");
		}
		
		if(!emailControl(candidate.getEmail())) {
			return new ErrorResult("Candidate registration not successful :(");
		}
		
		this.candidateService.add(candidate);
		return new SuccessResult("Candidate registration successful :)");
		
		
	}

	@Override
	public Result registerEmployer(Employer employer) {
		
		if(!this.employerService.add(employer).isSuccess()) {
			return new ErrorResult("Employer registration not successful :(");
		}
		
		if(!emailControl(employer.getEmail())) {
			return new ErrorResult("Employer registration not successful :(");
		}
		
		this.employerService.add(employer);
		return new SuccessResult("Employer registration successful :)");
		
		
	}
	
	
	//Business Code
	private boolean emailControl(String emailAddress) {
		
		return this.emailValidatorService.emailCheck(emailAddress);
	}


	
	
	
	

 

}
