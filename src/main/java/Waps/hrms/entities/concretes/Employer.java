package Waps.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
 

@Entity
@Data
@EqualsAndHashCode(callSuper=false) // incele => https://gunceljava.blogspot.com/2018/06/lombok-equalsandhashcode-anotasyonu.html
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_postings"})
public class Employer extends User{

	
	@NotNull
	@Column(name = "web_site")
	private String webSite;
	
	@NotNull
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@NotNull
	@Column(name = "is_email_verified")
	private Boolean isEmailVerified;
	
	@NotNull
	@Column(name = "is_verified_by_employee")
	private Boolean isVerifiedByEmployee;

	@NotNull
	@Column(name = "company_name")
	private String companyName;
	
	
	@OneToMany(mappedBy = "employer")
	private List<JobPosting> jobPostings;
	
}
