package se.fidde.internationalUser.models.user.finland;

import se.fidde.internationalUser.models.user.User;

public class FinnishUser {
	private final User user;
	private final FinnishUserData finnishUserData;
	
	public FinnishUser(User user, FinnishUserData finnishUserData) {
		this.user = user;
		this.finnishUserData = finnishUserData;
	}

	public User getUser() {
		return user;
	}

	public FinnishUserData getFinnishUserData() {
		return finnishUserData;
	}
}
