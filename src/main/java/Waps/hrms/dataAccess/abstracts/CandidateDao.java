package Waps.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Waps.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{

	
	Candidate findByEmail(String emailAddress);
	
	Candidate findByNationalityId(String nationalityId);
}
