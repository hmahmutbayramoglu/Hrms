package Waps.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
 

@Entity
@Data
@EqualsAndHashCode(callSuper=false) // incele => https://gunceljava.blogspot.com/2018/06/lombok-equalsandhashcode-anotasyonu.html
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor // ↓ extends ettiğimiz sınıfın özelliklerini alması için id leri primarykey yaptırıyoruz
@PrimaryKeyJoinColumn(name = "user_id",referencedColumnName = "id")
public class Employee extends User{
	

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

}
