package Waps.hrms.services.concretes;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import Waps.hrms.services.abstracts.FakeService;

@Service
public class MernisService implements FakeService{


	public boolean identityInquiry(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth) {
		
			return true;		
	}

}
