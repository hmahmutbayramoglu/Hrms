package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.JobTitleService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.core.utilities.results.SuccessDataResult;
import Waps.hrms.core.utilities.results.SuccessResult;
import Waps.hrms.dataAccess.abstracts.JobTitleDao;
import Waps.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		
		super();
		this.jobTitleDao = jobTitleDao;
	}
	
	
	@Override
	public DataResult<List<JobTitle>> getAll() {
	
		var result  = this.jobTitleDao.findAll();
		
		return new SuccessDataResult<List<JobTitle>>(result);
		
	}

	@Override
	public Result add(JobTitle jobTitle) {
		
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Added JobTitle");
	}

}
