package se.fidde.internationalUser.models.user.sweden;

import se.fidde.internationalUser.models.user.User;

public class SwedishUser {
	private final User user;
	private final SwedishUserData swedishUserData;
	
	public SwedishUser(User user, SwedishUserData swedishUserData) {
		this.user = user;
		this.swedishUserData = swedishUserData;
	}

	public User getUser() {
		return user;
	}

	public SwedishUserData getSwedishUserData() {
		return swedishUserData;
	}
}
