package com.exercises.goodpatterns.challenges;

public final class User {
	private final String userNickname;
	private final String userPeselId;
	private final String userName;
	private final String userSurname;
	
	public User(final String userNickname, final String userPeselId, final String userName, final String userSurname) {
		this.userNickname = userNickname;
		this.userPeselId = userPeselId;
		this.userName = userName;
		this.userSurname = userSurname;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public String getUserPeselId() {
		return userPeselId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userPeselId == null) ? 0 : userPeselId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userPeselId == null) {
			if (other.userPeselId != null)
				return false;
		} else if (!userPeselId.equals(other.userPeselId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "userNickname =" + userNickname;
	}	
}
