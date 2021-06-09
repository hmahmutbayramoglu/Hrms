package Waps.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.JobPostingService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.core.utilities.results.SuccessDataResult;
import Waps.hrms.core.utilities.results.SuccessResult;
import Waps.hrms.dataAccess.abstracts.JobPostingDao;
import Waps.hrms.entities.concretes.JobPosting;

@Service 
public class JobPostingManager implements JobPostingService{

	

	private JobPostingDao jobPostingDao;
	
	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}

	
	@Override
	public DataResult<List<JobPosting>> getAll() {
		
		var result = this.jobPostingDao.findAll();
		return new SuccessDataResult<List<JobPosting>>(result , "Job postings listed :) ");
	}
	
	@Override
	public DataResult<List<JobPosting>> getByIsActive() {
	 
		var result = this.jobPostingDao.getByIsActive();
		return new  SuccessDataResult<List<JobPosting>>(result, "Active postings are listed");
	}

	@Override
	public Result add(JobPosting jobTitle) {
	 
		return new SuccessResult(jobTitle.getJobName() +" "+"Job posting added :) ");
	}


	@Override
	public DataResult<List<JobPosting>> getAllByIsActiveAndEmployerId(int employerId) {

		var result = this.jobPostingDao.GetAllByIsActiveAndEmployerId(employerId);
		return new SuccessDataResult<List<JobPosting>>(result, "GetAllByIsActiveAndEmployerId");
	}


	@Override
	public Result deactivateThePosting(int jobPostingId) {
		
		
		
		JobPosting jobPosting = this.jobPostingDao.getById(jobPostingId);
		 
		
		jobPosting.setActive(!jobPosting.isActive());
	
		
		this.jobPostingDao.save(jobPosting);
		 
		return new SuccessResult("deactivateThePosting");
	} 

 


}
