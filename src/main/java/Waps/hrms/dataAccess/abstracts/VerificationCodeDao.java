package Waps.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Waps.hrms.entities.concretes.VerificationCode;

 
public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer>{

}
