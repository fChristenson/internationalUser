package se.fidde.internationalUser.models.user.finland;

/**
 * Why a FinnishPersonalIdentityCode class?
 * 
 * Because a Finnish personal identity code will have
 * different rules than other countries with a personal identity code.
 * 
 * @author fredrik
 *
 */
public class FinnishPersonalIdentityCode {
	/**
	 * "But Fredrik, isn't this just a PersonalNumber?"
	 * 
	 * No, this is something that means the same thing
	 * as a personalNumber to us humans but the rules
	 * for how it works are different and that means
	 * that in the program we need to know
	 * what those rules are.
	 */
	private final String personalIdentityCode;
	
	public FinnishPersonalIdentityCode(String personalIdentityCode) {
		this.personalIdentityCode = personalIdentityCode;
	}

	public String getPersonalIdentityCode() {
		return personalIdentityCode;
	}
}
