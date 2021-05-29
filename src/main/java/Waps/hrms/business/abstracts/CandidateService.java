package Waps.hrms.business.abstracts;

import java.util.List;

import Waps.hrms.entities.concretes.Candidate;


public interface CandidateService {
	List<Candidate> getAll();
}
