package Waps.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import Waps.hrms.entities.concretes.Employer;


public interface EmployerDao extends JpaRepository<Employer, Integer>{

	Employer findByEmail(String emailAddress);
	
}
