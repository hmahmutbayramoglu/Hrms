package Waps.hrms.business.abstracts;

import java.util.List;

import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.entities.concretes.JobPosting;


public interface JobPostingService {

	DataResult<List<JobPosting>> getAll();
	
	DataResult<List<JobPosting>> getByIsActive();
	
	DataResult<List<JobPosting>> getAllByIsActiveAndEmployerId(int employerId);
	
	Result add(JobPosting jobTitle);
	
	Result deactivateThePosting(int jobPostingId);
}
