package se.fidde.internationalUser.models.user.denmark;

import se.fidde.internationalUser.models.user.User;

public class DanishUser {
	private final User user;
	private final DanishUserData danishUserData;
	
	public DanishUser(User user, DanishUserData danishUserData) {
		this.user = user;
		this.danishUserData = danishUserData;
	}

	public User getUser() {
		return user;
	}

	public DanishUserData getSwedishUserData() {
		return danishUserData;
	}
}
