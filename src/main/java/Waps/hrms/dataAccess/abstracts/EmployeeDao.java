package Waps.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Waps.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
