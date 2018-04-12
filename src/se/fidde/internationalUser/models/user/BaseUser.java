package se.fidde.internationalUser.models.user;

abstract class BaseUser {
	private final UserId id; // userId has the same rules for everyone
	private final Address address; // address has the same rules for everyone
	private final EmailAddress emailAddress; // email has the same rules for everyone
	
	public BaseUser(EmailAddress emailAddress, Address address) {
		this.id = UserId.random();
		this.emailAddress = emailAddress;
		this.address = address;
	}

	public UserId getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}
}
