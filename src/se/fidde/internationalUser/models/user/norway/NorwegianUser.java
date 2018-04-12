package se.fidde.internationalUser.models.user.norway;

import se.fidde.internationalUser.models.user.BaseUser;
import se.fidde.internationalUser.models.user.User;

public class NorwegianUser extends BaseUser {
	private final NorwegianUserData norwegianUserData;
	
	public NorwegianUser(User user, NorwegianUserData norwegianUserData) {
		super(user.getEmailAddress(), user.getAddress());
		this.norwegianUserData = norwegianUserData;
	}

	public NorwegianPersonalNumber getPersonalNumber() {
		return this.norwegianUserData.getPersonalNumber();
	}
}
