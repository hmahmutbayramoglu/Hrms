package Waps.hrms.business.abstracts;

import java.util.List;

import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.entities.concretes.Employer;

 

public interface EmployerService {

	DataResult<List<Employer>> getAll();
	
	Result add(Employer employer);

}
