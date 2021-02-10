package com.exercises.testing.forum;

public class ForumPost {
	String postBody;
	String author;
		
	public ForumPost(String postBody, String author) {
		super();
		this.postBody = postBody;
		this.author = author;
	}
	
	public String getPostBody() {
		return postBody;
	}
	
	public String getAuthor() {
		return author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((postBody == null) ? 0 : postBody.hashCode());
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
		ForumPost other = (ForumPost) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (postBody == null) {
			if (other.postBody != null)
				return false;
		} else if (!postBody.equals(other.postBody))
			return false;
		return true;
	}	
}
