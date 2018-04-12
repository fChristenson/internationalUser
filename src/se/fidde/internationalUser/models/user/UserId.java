package se.fidde.internationalUser.models.user;

import java.util.UUID;

public class UserId {
	private final UUID id;
	
	public UserId(UUID id) {
		this.id = id;
	}
	
	public static UserId random() {
		return new UserId(UUID.randomUUID());
	}

	public UUID getId() {
		return id;
	}
}
