package Waps.hrms.business.abstracts;

import java.util.List;

import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.entities.concretes.Candidate;
import Waps.hrms.entities.concretes.Employee;

public interface EmployeeService {

	

	DataResult<List<Employee>> getAll();
	Result add(Employee employee);
}
