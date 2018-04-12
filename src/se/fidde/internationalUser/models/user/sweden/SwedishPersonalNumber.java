package se.fidde.internationalUser.models.user.sweden;

/**
 * Why a SwedishPersonalNumber class?
 * 
 * Because a Swedish personal number will have
 * different rules than other countries with a personal number.
 * 
 * @author fredrik
 *
 */
public class SwedishPersonalNumber {
	private final String personalNumber;
	
	public SwedishPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}
}
