package se.fidde.internationalUser.models.user.denmark;

import se.fidde.internationalUser.models.user.BaseUser;
import se.fidde.internationalUser.models.user.User;

public class DanishUser extends BaseUser {
	private final DanishUserData danishUserData;
	
	public DanishUser(User user, DanishUserData danishUserData) {
		super(user.getEmailAddress(), user.getAddress());
		this.danishUserData = danishUserData;
	}

	public DanishPersonalNumber getPersonalNumber() {
		return this.danishUserData.getPersonalNumber();
	}
}
