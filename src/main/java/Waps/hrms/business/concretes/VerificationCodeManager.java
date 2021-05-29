package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.VerificationCodeService;
import Waps.hrms.dataAccess.abstracts.VerificationCodeDao;
import Waps.hrms.entities.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService{

	VerificationCodeDao verificationCodeDao;
	
	@Autowired
 	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		
		super();
		this.verificationCodeDao = verificationCodeDao;
	}
	
	
	@Override
	public List<VerificationCode> getAll() {
 
		return this.verificationCodeDao.findAll();
	}

}
