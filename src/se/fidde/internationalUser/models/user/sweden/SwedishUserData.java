package se.fidde.internationalUser.models.user.sweden;

public class SwedishUserData {
	private final SwedishPersonalNumber personalNumber; 
	
	public SwedishUserData(SwedishPersonalNumber personalNumber) {
		this.personalNumber = personalNumber;
	}

	public SwedishPersonalNumber getPersonalNumber() {
		return personalNumber;
	}
}
