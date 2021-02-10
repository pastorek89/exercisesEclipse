package com.exercises.testing.library;

public class LibraryUser {
	String firstName;
	String lastName;
	String peselId;
	
	
	public LibraryUser(String firstName, String lastName, String peselId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.peselId = peselId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPeselId() {
		return peselId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((peselId == null) ? 0 : peselId.hashCode());
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
		LibraryUser other = (LibraryUser) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (peselId == null) {
			if (other.peselId != null)
				return false;
		} else if (!peselId.equals(other.peselId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LibraryUser [firstName=" + firstName + ", lastName=" + lastName + ", peselId=" + peselId + "]";
	}	
}
