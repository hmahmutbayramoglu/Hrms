package Waps.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_schools")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidate_curriculum_vitaes"})
public class CandidateSchool {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne()
	@JsonProperty(access = Access.WRITE_ONLY)
	@JoinColumn(name = "cv_id")
	private CandidateCurriculumVitae candidateCurriculumVitae;
 
 
	
	@Column(name = "school_department_id")
	private int schoolDepartmentId;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "finish_date")
	private LocalDate finishDate;

	@Column(name = "status")
	private String status;

	@Column(name = "is_deleted")
	private boolean isDeleted;
	
	
	
	
	
	
	
	
	
	
	

}
