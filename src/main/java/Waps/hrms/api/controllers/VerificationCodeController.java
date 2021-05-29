package Waps.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Waps.hrms.business.abstracts.VerificationCodeService;
import Waps.hrms.entities.concretes.VerificationCode;

@RestController
@RequestMapping("/api/verificationCodes")
public class VerificationCodeController {
	
	private VerificationCodeService verificationCodeService;
	
	@Autowired
	public VerificationCodeController(VerificationCodeService verificationCodeService) {
		super();
		this.verificationCodeService = verificationCodeService;
	}
	
	@GetMapping("/getall")
	public List<VerificationCode> getAll(){
		
		return this.verificationCodeService.getAll();
	}
	

}
