package Waps.hrms.core.utilities.confirmation.concretes;

import java.util.UUID;

import org.springframework.stereotype.Service;

import Waps.hrms.core.utilities.confirmation.abstracts.ConfirmationService;

@Service
public class EmailConfirmationManager implements ConfirmationService{


	void sendVerificationCode(String email) { 
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		
	}
  
   
	public String codeGenerator() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		return verificationCode;
	}
	
}
