package se.fidde.internationalUser.models.user.norway;

import se.fidde.internationalUser.models.user.User;

public class NorwegianUser {
	private final User user;
	private final NorwegianUserData norwegianUserData;
	
	public NorwegianUser(User user, NorwegianUserData norwegianUserData) {
		this.user = user;
		this.norwegianUserData = norwegianUserData;
	}

	public User getUser() {
		return user;
	}

	public NorwegianUserData getNorwegianUserData() {
		return norwegianUserData;
	}
}
