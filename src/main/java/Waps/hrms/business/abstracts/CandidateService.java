package Waps.hrms.business.abstracts;

import java.util.List;

import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.entities.concretes.Candidate;


public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
}
