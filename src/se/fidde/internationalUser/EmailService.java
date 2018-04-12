package se.fidde.internationalUser;

import se.fidde.internationalUser.models.user.User;

public class EmailService {

	// This is the sort of method that will be used for all
	// our users and we will need to know what language to
	// use in the email.
	public static void sendTranslatedNewsletter(User user) {
		if (user.isDanish()) {
			// send danish email
		} else if (user.isSwedish()) {
			// send swedish email
		}

		// ...
	}

	// This is the sort of method that will be used for all
	// our users and we will need to know what language to
	// use in the email.
	public static void sendNewsletter(User user) {
		// send the newsletter in english?
	}
}
