package se.fidde.internationalUser.models.user.denmark;

/**
 * Why a DanishPersonalNumber class?
 * 
 * Because a Danish personal number will have
 * different rules than other countries with a personal number.
 * 
 * @author fredrik
 *
 */
public class DanishPersonalNumber {
	private final String personalNumber;
	
	public DanishPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}
}
