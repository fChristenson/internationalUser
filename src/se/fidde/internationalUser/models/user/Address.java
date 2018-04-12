package se.fidde.internationalUser.models.user;

public class Address {
	private final String street;
	private final String zipCode;
	private final String city;
	
	public Address(String street, String zipCode, String city) {
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getCity() {
		return city;
	}
}
