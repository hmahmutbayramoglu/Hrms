package Waps.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import Waps.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
