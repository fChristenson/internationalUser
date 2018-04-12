package se.fidde.internationalUser;

import se.fidde.internationalUser.models.user.Address;
import se.fidde.internationalUser.models.user.EmailAddress;
import se.fidde.internationalUser.models.user.User;
import se.fidde.internationalUser.models.user.finland.FinnishPersonalIdentityCode;
import se.fidde.internationalUser.models.user.finland.FinnishUserData;
import se.fidde.internationalUser.models.user.norway.NorwegianPersonalNumber;
import se.fidde.internationalUser.models.user.norway.NorwegianUserData;
import se.fidde.internationalUser.models.user.sweden.SwedishPersonalNumber;
import se.fidde.internationalUser.models.user.sweden.SwedishUserData;

public class Main {
	public static void main(String[] args) {
		Address address = new Address("foo", "bar", "baz");
		EmailAddress emailAddress = new EmailAddress("foo@bar.se");
		
		SwedishPersonalNumber swedishPersonalNumber = new SwedishPersonalNumber("1337");
		SwedishUserData swedishUserData = new SwedishUserData(swedishPersonalNumber);
		
		NorwegianPersonalNumber norwegianPersonalNumber = new NorwegianPersonalNumber("1337");
		NorwegianUserData norwegianUserData = new NorwegianUserData(norwegianPersonalNumber);
		
		FinnishPersonalIdentityCode finnishIdCode = new FinnishPersonalIdentityCode("1337");
		FinnishUserData finnishUserData = new FinnishUserData(finnishIdCode);
		
		/**
		 * With this approach we can write a program that can easily apply common logic
		 * to each user and figure out what nationality a user has when it is needed.
		 * 
		 * A international program is one of the hardest things you can build as it has
		 * to account for that the rules for "the same thing" is different depending
		 * on the context.
		 * 
		 * Thank god we don't have to deal with translations or currency right now.
		 */
		User me = new User(emailAddress, address, swedishUserData);
		User myNorwegianFriend = new User(emailAddress, address, norwegianUserData);
		User myFinnishFriend = new User(emailAddress, address, finnishUserData);
		User myExoticFriend = new User(emailAddress, address, swedishUserData, norwegianUserData);
		User myOtherExoticFriend = new User(emailAddress, address, finnishUserData, swedishUserData);
		User myFriendWithCitizenshipAddiction = new User(emailAddress, address, swedishUserData, norwegianUserData, finnishUserData);
		
		if(me.isFinnish()) {
			System.out.println("Mom look at me, I'm finnish!");
		}
		
		if(myNorwegianFriend.isFinnish()) {
			System.out.println("Mom look at me, I'm finnish!");
		} 
		
		if(myFinnishFriend.isDanish()) {
			System.out.println("Mom look at me, I'm danish!");
		} 
		
		if(myExoticFriend.isSwedish()) {
			System.out.println("Mom look at me, I'm swedish!");
		}
		
		if(myOtherExoticFriend.isFinnish()) {
			System.out.println("Mom look at me, I'm finnish!");
		} 
		
		if(myFriendWithCitizenshipAddiction.isNorwegian()) {
			System.out.println("Mom look at me, I'm norwegian!");
		}
	}
}
