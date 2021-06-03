package Waps.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode 
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_postings")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employer"})
public class JobPosting {
	 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	//@Column(name="employer_id")
	//private int employerId;
	
	@Column(name="job_title_id")
	private int jobTitleId;
	 
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="job_name")
	private String jobName;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="number_of_open_positions")
	private short numberOfOpenPositions;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive = true;
	
	@Column(name="is_deleted")
	private boolean isDeleted = false;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="release_date")
	private LocalDate releaseDate;
	
	
	
	
	//@Column(name="employer_id")
	//private int employerId;
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
}
