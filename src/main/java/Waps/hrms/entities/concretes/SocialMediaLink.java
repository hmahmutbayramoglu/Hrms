package Waps.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "social_media_links")
public class SocialMediaLink {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne()
	@JsonProperty(access = Access.WRITE_ONLY)
	@JoinColumn(name = "cv_id")
	private CandidateCurriculumVitae candidateCurriculumVitae;
 
	
	@Column(name = "social_media_id")
	private int socialMediaId;
	
	@Column(name = "link")
	private String link;
	
	@Column(name = "is_deleted")
	private boolean isDeleted;
	
	
	
	
	
	
	
	
	
	
	
}
