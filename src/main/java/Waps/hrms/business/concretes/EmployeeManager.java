package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import Waps.hrms.business.abstracts.EmployeeService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.core.utilities.results.SuccessDataResult;
import Waps.hrms.core.utilities.results.SuccessResult;
import Waps.hrms.dataAccess.abstracts.EmployeeDao;
import Waps.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		
		super();
		this.employeeDao = employeeDao;
	}
	
	
	@Override
	public DataResult<List<Employee>> getAll() {
	
		var result = this.employeeDao.findAll();
		return new SuccessDataResult<List<Employee>>(result);
	}


	@Override
	public Result add(@RequestBody Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Added Employee :) ");
	}

}
