package com.exercises.stream.forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
	private final String username;
	private final String realname;
	private final String location;
	private final Set<ForumUser> friends = new HashSet<>();
	
	public ForumUser(final String username, final String realname, final String location) {
		this.username = username;
		this.realname = realname;
		this.location = location;
	}
	
	public void addFriend(ForumUser user) {
		friends.add(user);
	}
	
	public boolean removeFriend(ForumUser user) {
		return friends.remove(user);
	}
	
	public Set<String> getLocationsOfFriends() {
		return friends.stream()
				.map(friend -> friend.getLocation())
				.collect(Collectors.toSet());
	}
	
	public Set<String> getLocationsOfFriendsOfFriends() {
		return friends.stream()
				.flatMap(user -> user.getFriends().stream())
				.filter(user -> user != this)
				.map(ForumUser:: getLocation)
				.collect(Collectors.toSet());
	}

	public String getUsername() {
		return username;
	}

	public String getRealname() {
		return realname;
	}

	public String getLocation() {
		return location;
	}

	public Set<ForumUser> getFriends() {
		return friends;
	}

	@Override
	public String toString() {
		return "ForumUser [username=" + username + ", realname=" + realname + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		ForumUser other = (ForumUser) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}	
}
