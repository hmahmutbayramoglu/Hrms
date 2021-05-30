package Waps.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Waps.hrms.entities.concretes.JobTitle;

 

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

}
