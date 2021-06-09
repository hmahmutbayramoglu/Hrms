package Waps.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Waps.hrms.business.abstracts.CandidateCurriculumVitaeService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.core.utilities.results.SuccessDataResult;
import Waps.hrms.dataAccess.abstracts.CandidateCurriculumVitaeDao;
import Waps.hrms.entities.concretes.CandidateCurriculumVitae;

@Service
public class CandidateCurriculumVitaeManager implements CandidateCurriculumVitaeService{

	private CandidateCurriculumVitaeDao candidateCurriculumVitaeDao;


	@Autowired
	public CandidateCurriculumVitaeManager(CandidateCurriculumVitaeDao candidateCurriculumVitaeDao) {
		super();
		this.candidateCurriculumVitaeDao = candidateCurriculumVitaeDao;
	}

	
	
	
	
	@Override
	public DataResult<List<CandidateCurriculumVitae>> getAll() {
		 
		var data = this.candidateCurriculumVitaeDao.findAll();
		
		
		return new SuccessDataResult<List<CandidateCurriculumVitae>>(data, "CandidateCurriculumVitaeDao");
	}

}
