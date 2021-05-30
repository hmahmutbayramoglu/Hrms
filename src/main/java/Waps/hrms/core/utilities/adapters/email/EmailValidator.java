package Waps.hrms.core.utilities.adapters.email;

import org.springframework.stereotype.Service;

import Waps.hrms.services.concretes.EmailService;

@Service
public class EmailValidator implements EmailValidatorService{

	
	public boolean emailCheck (String emailAddress) {
		
		  EmailService emailValidatorService =new EmailService();
		  
		  return emailValidatorService.emailCheck(emailAddress);
			
	}

 
	
}
