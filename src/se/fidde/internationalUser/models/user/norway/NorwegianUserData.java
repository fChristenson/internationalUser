package se.fidde.internationalUser.models.user.norway;

public class NorwegianUserData {
	private final NorwegianPersonalNumber personalNumber; 
	
	public NorwegianUserData(NorwegianPersonalNumber personalNumber) {
		this.personalNumber = personalNumber;
	}

	public NorwegianPersonalNumber getPersonalNumber() {
		return personalNumber;
	}
}
