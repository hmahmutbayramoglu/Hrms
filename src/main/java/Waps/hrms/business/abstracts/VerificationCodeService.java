package Waps.hrms.business.abstracts;

import java.util.List;

import Waps.hrms.core.utilities.results.DataResult;
import Waps.hrms.entities.concretes.VerificationCode;

 

public interface VerificationCodeService {

	DataResult<List<VerificationCode>> getAll();
}
