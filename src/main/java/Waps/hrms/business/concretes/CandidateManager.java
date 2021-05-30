package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Waps.hrms.business.abstracts.CandidateService;
import Waps.hrms.core.utilities.adapters.mernis.UserCheckService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.ErrorResult;
import Waps.hrms.core.utilities.results.Result;
import Waps.hrms.core.utilities.results.SuccessDataResult;
import Waps.hrms.core.utilities.results.SuccessResult;
import Waps.hrms.dataAccess.abstracts.CandidateDao;
import Waps.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	//Cayır cayır çalışıyor ;)
	
	private CandidateDao candidateDao;
	private UserCheckService userCheckService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, UserCheckService userCheckService) {
		
		super();
		this.candidateDao = candidateDao;
		this.userCheckService = userCheckService;
	}
	
	@Override
	public DataResult<List<Candidate>> getAll() {


		var result =this.candidateDao.findAll();
		return new  SuccessDataResult<List<Candidate>>(result);
	
	}
	
	@Override
	public Result add(Candidate candidate) {
	
	 
		if(!this.freeSpaceControl(candidate)) {
			return new ErrorResult("Please do not leave unfilled fields :( ");
		} 
 
		if(!this.identityCheck(candidate)) {
			return new ErrorResult("You can't fool our system :( ");
		}
		
		if(!this.duplicateMailCheck(candidate.getEmail())) {
			return new ErrorResult("This e-mail address has already been registered :( ");
		}
		
		if(!this.nationalityIdEmptyControl(candidate.getNationalityId())) {
			return new ErrorResult("Previously used nationality ID :( ");
		}
		
		if(this.identityCheck(candidate) && this.freeSpaceControl(candidate) && this.duplicateMailCheck(candidate.getEmail())) {
			this.candidateDao.save(candidate);
			return new SuccessResult("Added Candidate :) ");
		} 
		
		
		
		
		return new ErrorResult("Cannot Add Candidate :( ");

 
	}
	
	
	//Business Codes
	
	private boolean freeSpaceControl(Candidate candidate) {

		if(candidate.getFirstName().isEmpty() || candidate.getLastName().isEmpty() || candidate.getEmail().isEmpty() || 
				candidate.getPassword().isEmpty() || candidate.getIsDeleted() == null || candidate.getDate().equals(null) ||
				candidate.getIsDeleted() == null || candidate.getNationalityId().isEmpty() || candidate.getDateOfBirth().equals(null) ||
						candidate.getIsEmailVerified() == null
				) {
			return false;
		}
		return true;
			
	}
	
	private boolean identityCheck(Candidate candidate) {
		
		
		return this.userCheckService.userControl(candidate.getNationalityId(),candidate.getFirstName(), candidate.getLastName(), candidate.getDateOfBirth());
	}

	
	private boolean duplicateMailCheck(String emailAddress) {
		
		if(this.candidateDao.findByEmail(emailAddress) == null) {
			return true;
		}
		return false;
		
	}
	
	private boolean nationalityIdEmptyControl(String nationalityId) {
		if(this.candidateDao.findByNationalityId(nationalityId) == null) {
			return true;
		}
		return false;
	}
	
	
	
	
}
