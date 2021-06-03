package Waps.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 

import Waps.hrms.business.abstracts.JobPostingService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/JobPostings")
public class JobPostingsController {

	private JobPostingService jobPostingService;
	
	@Autowired
	public JobPostingsController(JobPostingService jobPostingService) {
	
		super();
		this.jobPostingService = jobPostingService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosting>> getAll() {
		
		
		return this.jobPostingService.getAll();

	} 
	
	@GetMapping("/getbyisactive")
	public DataResult<List<JobPosting>> getByIsActive() {
		
		
		return this.jobPostingService.getByIsActive();

	} 
	
	@GetMapping("/GetAllByIsActiveAndEmployerId")
	public DataResult<List<JobPosting>> getAllByIsActiveAndEmployerId(@RequestParam int employerId) {


		return this.jobPostingService.getAllByIsActiveAndEmployerId(employerId);
	} 
	
	@PostMapping("/deactivateThePosting")
	public Result deactivateThePosting(@RequestBody int jobPostingId) {


		return this.jobPostingService.deactivateThePosting(jobPostingId); 
		
		
	} 
 	
	
}
