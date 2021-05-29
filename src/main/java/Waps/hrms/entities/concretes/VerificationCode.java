package Waps.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@EqualsAndHashCode(callSuper=false) // incele => https://gunceljava.blogspot.com/2018/06/lombok-equalsandhashcode-anotasyonu.html
@Table(name = "verification_codes")
@AllArgsConstructor
@NoArgsConstructor
public class VerificationCode {

	
	public VerificationCode(int userId, String code, LocalDate expiredDate) {
		super();
		this.userId = userId;
		this.emailVerificationCode = code;
		this.expiredDate = expiredDate;
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="email_verification_code")
	private String emailVerificationCode; 
	
	@Column(name="created_date")//oluşturulma tarihini bu zaman yap
	private LocalDate createdDate=LocalDate.now();
	
	//bu kodun son kullanma tarihi
	@Column(name="expired_date")  
	private LocalDate expiredDate;
	
	@Column(name="is_activate") //ilk değer true
	private Boolean isActivate = true;
	
	@Column(name="is_deleted")
	private Boolean isDeleted=false;
	
	//onaylama tarihi
	@Column(name="confirmed_date")
	private LocalDate confirmedDate;
}
