package Waps.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import Waps.hrms.entities.concretes.JobPosting;
import Waps.hrms.entities.dtos.JobPostingWithEmployerDto;
 

 

public interface JobPostingDao extends JpaRepository<JobPosting, Integer>{

 
	
	@Query("From JobPosting where isActive=true")
	List<JobPosting> getByIsActive();

	@Query("From JobPosting where isActive = true and employer.id=:employerId")
	List<JobPosting> GetAllByIsActiveAndEmployerId(int employerId);
	
	@Query("Select new Waps.hrms.entities.dtos.JobPostingWithEmployerDto(j.id, e.id) From Employer e Inner Join  e.jobPostings j")
	List<JobPostingWithEmployerDto> getJobPostingWithEmployerDetails();
 
  
	
 
	
	JobPosting getById(int id);
	
   //@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName,c.categoryName) From Category c Inner Join c.products p  ")
  //  List<ProductWithCategoryDto>  getProductWithCategoryDetails();


}
