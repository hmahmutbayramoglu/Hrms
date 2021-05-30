package Waps.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy=InheritanceType.JOINED) //miras vermesini sağlıyor
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	// boolean default true => default true yapıyor
	@Column(name="is_active", columnDefinition = "boolean default true") 
	private boolean isActive;
	
	@Column(name="date")
	private LocalDate date;

	//default false yani silinmedi
	@Column(name="is_deleted",columnDefinition = "boolean default false")
	private Boolean isDeleted= false;
	
 
	
}
