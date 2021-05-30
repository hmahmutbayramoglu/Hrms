package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.EmployerService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.SuccessDataResult;
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

}
