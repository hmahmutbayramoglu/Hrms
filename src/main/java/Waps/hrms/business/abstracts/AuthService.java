package Waps.hrms.business.abstracts;

import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.entities.concretes.Candidate;
import Waps.hrms.entities.concretes.Employer;

public interface AuthService {

	
	Result registerCandidate(Candidate candidate);

	Result registerEmployer(Employer employer);

 
}
