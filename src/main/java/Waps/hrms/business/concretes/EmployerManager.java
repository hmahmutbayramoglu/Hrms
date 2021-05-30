package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.EmployerService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.ErrorResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.core.utilities.results.SuccessDataResult;
import Waps.hrms.core.utilities.results.SuccessResult;
import Waps.hrms.dataAccess.abstracts.EmployerDao;
import Waps.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{


	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {

		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		var result =  this.employerDao.findAll();
		return new SuccessDataResult<List<Employer>>(result);
	}

	@Override
	public Result add(Employer employer) {

		if(!freeSpaceControl(employer)) {
			return new ErrorResult("Please do not leave unfilled fields :( ");
		}
		
		if(!duplicateMailCheck(employer.getEmail())) {
			return new ErrorResult("This e-mail address has already been registered :( ");
		}

		
		
		if(freeSpaceControl(employer) && duplicateMailCheck(employer.getEmail())) {
			this.employerDao.save(employer);
			return new SuccessResult("Added Employer :)");
		}


		return new ErrorResult("Cannot Add Employer :( ");

	}



	//Business Codes

	private boolean freeSpaceControl(Employer employer) {

		if(employer.getCompanyName().isEmpty() || employer.getWebSite().isEmpty() || employer.getEmail().isEmpty()
				|| employer.getPhoneNumber().isEmpty() || employer.getPassword().isEmpty() ||
				employer.getDate() == null || employer.getIsDeleted() == null || employer.getIsEmailVerified() == null || 
				employer.getIsVerifiedByEmployee() == null ){
			return false;
		}
		
		return true;

	}
 
	private boolean duplicateMailCheck(String emailAddress) {
		
		if(this.employerDao.findByEmail(emailAddress) == null) {
			return true;
		}
		return false;
		
	}


}
