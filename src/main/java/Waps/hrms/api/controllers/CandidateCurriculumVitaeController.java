package Waps.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Waps.hrms.business.abstracts.CandidateCurriculumVitaeService;
import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.entities.concretes.CandidateCurriculumVitae;

@RestController
@RequestMapping("/api/CandidateCurriculumVitaes")
public class CandidateCurriculumVitaeController {

	
	private CandidateCurriculumVitaeService candidateCurriculumVitaeService;
	
	@Autowired
	public CandidateCurriculumVitaeController(CandidateCurriculumVitaeService candidateCurriculumVitaeService) {
		super();
		this.candidateCurriculumVitaeService = candidateCurriculumVitaeService;
		
	}
	
	@GetMapping("/getall")
	public 	DataResult<List<CandidateCurriculumVitae>> getAll(){
		
		return this.candidateCurriculumVitaeService.getAll();
	}
	
}
