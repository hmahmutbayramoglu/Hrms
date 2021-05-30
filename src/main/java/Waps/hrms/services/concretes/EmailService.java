package Waps.hrms.services.concretes;

import org.springframework.stereotype.Service;

import Waps.hrms.services.abstracts.FakeService;

@Service
public class EmailService implements FakeService{

	public boolean emailCheck(String emailAddress) {
		return true;
	}
}
