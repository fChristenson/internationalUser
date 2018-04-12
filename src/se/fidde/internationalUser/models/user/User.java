package se.fidde.internationalUser.models.user;

import se.fidde.internationalUser.models.user.denmark.DanishUser;
import se.fidde.internationalUser.models.user.denmark.DanishUserData;
import se.fidde.internationalUser.models.user.finland.FinnishUser;
import se.fidde.internationalUser.models.user.finland.FinnishUserData;
import se.fidde.internationalUser.models.user.norway.NorwegianUser;
import se.fidde.internationalUser.models.user.norway.NorwegianUserData;
import se.fidde.internationalUser.models.user.sweden.SwedishUser;
import se.fidde.internationalUser.models.user.sweden.SwedishUserData;

/**
 * Why not use inheritance?
 * 
 * The problem is that every country will have different rules for what makes up
 * a user.
 * 
 * What happens when you realize that in Sweden the rules for what makes up a
 * address is different from what the rules are in Norway?
 * 
 * The problem with inheritance is that you soon realize how important it is
 * that the type means the same thing to everyone who wants to use it.
 * 
 * You also get access to things you don't want, what if we don't want a
 * PersonalNumber on a user?
 * 
 * "Oh Fredrik we can just create a class called ScandinavianUser and put the
 * PersonalNumber there", well no...
 * 
 * Because the Finnish do not have those numbers but a PersonalIdentityCode and
 * in Denmark the PersonalNumber has different rules than in Sweden.
 * 
 * I have found this way of creating an international user to be easy to
 * maintain at the cost of a lot of boilerplate code, good trade imo. We will
 * get a monster class but it will make the rest of our logic dirt simple.
 * 
 * This is the sort of problem where I will argue that the number of lines of
 * code will poison your mind and you will try to make this code "simpler" but
 * imo this is the sort of problem that is even at the base case complex and you
 * should not try to use fancy abstractions.
 * 
 * @author fredrik
 *
 */
public class User extends BaseUser {	
	/* 
	 *  Java has a field limit of 65535, we can support all nations in one class but make sure
	 *  that you keep this class "dumb", use services or helper methods to apply logic
	 *  and use this class to store and transform data, imo a general good rule of thumb
	 *
	 *  It would have been a lot cleaner if Java 8 had a trait system that supported fields 
	*/
	private final SwedishUserData swedishUserData; // What we store for a swedish user is different from other users
	private final NorwegianUserData norwegianUserData; // What we store for a norwegian user is different from other users
	private final FinnishUserData finnishUserData; // What we store for a finnish user is different from other users
	private final DanishUserData danishUserData; // What we store for a danish user is different from other users

	// what about triple citizenship in Norway, Finland and Sweden, are you seeing the problem?
	public User(EmailAddress emailAddress, Address address, SwedishUserData swedishUserData, NorwegianUserData norwegianUserData, 
			FinnishUserData finnishUserData) {
		super(emailAddress, address);
		this.swedishUserData = swedishUserData;
		this.norwegianUserData = norwegianUserData;
		this.finnishUserData = finnishUserData;
		this.danishUserData = null;
	}

	// what about dual citizenship in Norway and Finland?
	public User(EmailAddress emailAddress, Address address, NorwegianUserData norwegianUserData, FinnishUserData finnishUserData) {
		super(emailAddress, address);
		this.swedishUserData = null;
		this.norwegianUserData = norwegianUserData;
		this.finnishUserData = finnishUserData;
		this.danishUserData = null;
	}

	// what about dual citizenship in Sweden and Finland?
	public User(EmailAddress emailAddress, Address address, FinnishUserData finnishUserData, SwedishUserData swedishUserData) {
		super(emailAddress, address);
		this.swedishUserData = swedishUserData;
		this.norwegianUserData = null;
		this.finnishUserData = finnishUserData;
		this.danishUserData = null;
	}

	// what about dual citizenship in Norway and Sweden?
	public User(EmailAddress emailAddress, Address address, SwedishUserData swedishUserData, NorwegianUserData norwegianUserData) {
		super(emailAddress, address);
		this.swedishUserData = swedishUserData;
		this.norwegianUserData = norwegianUserData;
		this.finnishUserData = null;
		this.danishUserData = null;
	}

	// a danish citizen
	public User(EmailAddress emailAddress, Address address, DanishUserData danishUserData) {
		super(emailAddress, address);
		this.swedishUserData = null;
		this.norwegianUserData = null;
		this.finnishUserData = null;
		this.danishUserData = danishUserData;
	}

	// a finnish citizen
	public User(EmailAddress emailAddress, Address address, FinnishUserData finnishUserData) {
		super(emailAddress, address);
		this.swedishUserData = null;
		this.norwegianUserData = null;
		this.finnishUserData = finnishUserData;
		this.danishUserData = null;
	}

	// a swedish citizen
	public User(EmailAddress emailAddress, Address address, SwedishUserData swedishUserData) {
		super(emailAddress, address);
		this.swedishUserData = swedishUserData;
		this.norwegianUserData = null;
		this.finnishUserData = null;
		this.danishUserData = null;
	}

	// a norwegian citizen
	public User(EmailAddress emailAddress, Address address, NorwegianUserData norwegianUserData) {
		super(emailAddress, address);
		this.swedishUserData = null;
		this.norwegianUserData = norwegianUserData;
		this.finnishUserData = null;
		this.danishUserData = null;
	}

	// we probably want to throw an error if the conversion can't be done
	public FinnishUser toFinnishUser() {
		return new FinnishUser(this, this.getFinnishUserData());
	}

	// we probably want to throw an error if the conversion can't be done
	public SwedishUser toSwedishUser() {
		return new SwedishUser(this, this.getSwedishUserData());
	}

	// we probably want to throw an error if the conversion can't be done
	public NorwegianUser toNorwegianUser() {
		return new NorwegianUser(this, this.getNorwegianUserData());
	}

	// we probably want to throw an error if the conversion can't be done
	public DanishUser toDanishUser() {
		return new DanishUser(this, this.getDanishUserData());
	}

	public boolean isFinnish() {
		return this.getFinnishUserData() != null;
	}

	public boolean isSwedish() {
		return this.getSwedishUserData() != null;
	}

	public boolean isNorwegian() {
		return this.getNorwegianUserData() != null;
	}

	public boolean isDanish() {
		return this.getDanishUserData() != null;
	}

	public SwedishUserData getSwedishUserData() {
		return swedishUserData;
	}

	public NorwegianUserData getNorwegianUserData() {
		return norwegianUserData;
	}

	public FinnishUserData getFinnishUserData() {
		return finnishUserData;
	}

	public DanishUserData getDanishUserData() {
		return danishUserData;
	}
}
