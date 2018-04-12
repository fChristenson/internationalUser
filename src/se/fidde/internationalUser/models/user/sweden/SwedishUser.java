package se.fidde.internationalUser.models.user.sweden;

import se.fidde.internationalUser.models.user.BaseUser;
import se.fidde.internationalUser.models.user.User;

public class SwedishUser extends BaseUser {
	private final SwedishUserData swedishUserData;
	
	public SwedishUser(User user, SwedishUserData swedishUserData) {
		super(user.getEmailAddress(), user.getAddress());
		this.swedishUserData = swedishUserData;
	}

	public SwedishPersonalNumber getPersonalNumber() {
		return this.swedishUserData.getPersonalNumber();
	}
}
