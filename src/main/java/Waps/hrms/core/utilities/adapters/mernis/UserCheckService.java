package Waps.hrms.core.utilities.adapters.mernis;

import java.time.LocalDate;

public interface UserCheckService {

	boolean userControl(String identityNumber, String firstName, String lastName,LocalDate dateOfBirth);
}
