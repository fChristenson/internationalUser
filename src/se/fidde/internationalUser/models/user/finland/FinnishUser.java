package se.fidde.internationalUser.models.user.finland;

import se.fidde.internationalUser.models.user.BaseUser;
import se.fidde.internationalUser.models.user.User;

public class FinnishUser extends BaseUser {
	private final FinnishUserData finnishUserData;
	
	public FinnishUser(User user, FinnishUserData finnishUserData) {
		super(user.getEmailAddress(), user.getAddress());
		this.finnishUserData = finnishUserData;
	}

	public FinnishPersonalIdentityCode getPersonalIdentityCode() {
		return this.finnishUserData.getPersonalIdentityCode();
	}
}
