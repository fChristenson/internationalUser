package se.fidde.internationalUser.models.user.denmark;

public class DanishUserData {
	private final DanishPersonalNumber personalNumber; 
	
	public DanishUserData(DanishPersonalNumber personalNumber) {
		this.personalNumber = personalNumber;
	}

	public DanishPersonalNumber getPersonalNumber() {
		return personalNumber;
	}
}
