package com.exercises.testing.forum;

public class ForumComment {
	ForumPost forumPost;
	String commentBody;
	String author;
	
	public ForumComment(ForumPost forumPost, String commentBody, String author) {
		super();
		this.forumPost = forumPost;
		this.commentBody = commentBody;
		this.author = author;
	}

	public ForumPost getForumPost() {
		return forumPost;
	}

	public String getCommentBody() {
		return commentBody;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((commentBody == null) ? 0 : commentBody.hashCode());
		result = prime * result + ((forumPost == null) ? 0 : forumPost.hashCode());
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
		ForumComment other = (ForumComment) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (commentBody == null) {
			if (other.commentBody != null)
				return false;
		} else if (!commentBody.equals(other.commentBody))
			return false;
		if (forumPost == null) {
			if (other.forumPost != null)
				return false;
		} else if (!forumPost.equals(other.forumPost))
			return false;
		return true;
	}
}
