package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.VerificationCodeService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.SuccessDataResult;
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
	public DataResult<List<VerificationCode>> getAll() {
 
		var result =  this.verificationCodeDao.findAll();
		return new SuccessDataResult<List<VerificationCode>>(result);
	}

}
