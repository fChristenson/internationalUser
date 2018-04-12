package se.fidde.internationalUser;

import se.fidde.internationalUser.models.user.User;
import se.fidde.internationalUser.models.user.sweden.SwedishUser;

public class BankRegistrationService {
	public static void registerUser(User user) {
		if(user.isSwedish()) {
			SwedishUser swedishUser = user.toSwedishUser();
			SomeSwedishBankService.registerUserWithBank(swedishUser);
		}
	}
}

class SomeSwedishBankService {
	// we can only do this if the user is swedish
	public static void registerUserWithBank(SwedishUser user) {
		// register
	}
}