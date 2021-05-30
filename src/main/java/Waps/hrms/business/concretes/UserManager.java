package Waps.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired; //beans => proje class ı
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.UserService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.SuccessDataResult;
import Waps.hrms.dataAccess.abstracts.UserDao;
import Waps.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired // Autofac in bu interface istenirse bu class ı ver mantığında çalışır projedeki UserDao karşılık gelen classın instancını oluşturur
	public UserManager(UserDao userDao) {
		super();
		this.userDao= userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {

		var result = this.userDao.findAll();
		return new SuccessDataResult<List<User>>(result) ;
	}

}
