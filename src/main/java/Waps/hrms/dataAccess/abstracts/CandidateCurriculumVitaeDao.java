package Waps.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Waps.hrms.entities.concretes.CandidateCurriculumVitae;

 

public interface CandidateCurriculumVitaeDao extends JpaRepository<CandidateCurriculumVitae, Integer>{

}
