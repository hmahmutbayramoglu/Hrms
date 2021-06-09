package Waps.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "skills")
public class Skill {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	 
	@Column(name = "technology_category_id")
	private int technologyCategoryId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "is_deleted")
	private boolean isDeleted;
	
	
	
	
	
}
