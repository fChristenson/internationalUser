package se.fidde.internationalUser.models.user.norway;

/**
 * Why a NorwegianPersonalNumber class?
 * 
 * Because a Norwegian personal number will have
 * different rules than other countries with a personal number.
 * 
 * @author fredrik
 *
 */
public class NorwegianPersonalNumber {
	private final String personalNumber;
	
	public NorwegianPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}
}
