package se.fidde.internationalUser.models.user.finland;

public class FinnishUserData {
	private final FinnishPersonalIdentityCode personalIdentityCode; 
	
	public FinnishUserData(FinnishPersonalIdentityCode personalIdentityCode) {
		this.personalIdentityCode = personalIdentityCode;
	}

	public FinnishPersonalIdentityCode getPersonalIdentityCode() {
		return personalIdentityCode;
	}
}
