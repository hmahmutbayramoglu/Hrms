package Waps.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_curriculum_vitaes")
@JsonIgnoreProperties({"hibernateLazyInitializer","candidateCurriculumVitae"})
public class CandidateCurriculumVitae {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;


	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;




	@Column(name = "img_url")
	private String imgUrl;

	@Column(name = "explanation")
	private String explanation;

	@Column(name = "date")
	private LocalDate date;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "is_deleted")
	private boolean isDeleted;



	@OneToMany(mappedBy ="candidateCurriculumVitae")
	private List<CandidateSchool> candidateSchools;


	@OneToMany(mappedBy ="candidateCurriculumVitae")
	private List<CandidateSkill> candidateSkills;


	@OneToMany(mappedBy ="candidateCurriculumVitae")
	private List<Experience> experiences; 


	@OneToMany(mappedBy ="candidateCurriculumVitae")
	private List<SocialMediaLink>  socialMediaLinks; 
	
	@OneToMany(mappedBy ="candidateCurriculumVitae")
	private List<Langue> langues; 



}
