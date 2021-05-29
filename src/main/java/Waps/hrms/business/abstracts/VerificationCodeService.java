package Waps.hrms.business.abstracts;

import java.util.List;

import Waps.hrms.entities.concretes.VerificationCode;

 

public interface VerificationCodeService {

	List<VerificationCode> getAll();
}
