package Waps.hrms.core.utilities.adapters.mernis;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.services.concretes.MernisService;

@Service
public class MernisAdapter implements UserCheckService{

	private MernisService mernisService;
	
	@Autowired
	public MernisAdapter(MernisService mernisService) {
		super();
		this.mernisService = mernisService;
	}
	
	@Override
	public boolean userControl(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth) {
		
		return	this.mernisService.identityInquiry(identityNumber, firstName, lastName, dateOfBirth);
	}

}
