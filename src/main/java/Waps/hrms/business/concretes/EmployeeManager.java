package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.EmployeeService;
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
	public List<Employee> getAll() {
	
		return this.employeeDao.findAll();
	}

}
