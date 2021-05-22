package Waps.hrms.business.abstracts;

import java.util.List;

import Waps.hrms.entities.concretes.User;



public interface UserService {

	List<User> getAll();
	
}
