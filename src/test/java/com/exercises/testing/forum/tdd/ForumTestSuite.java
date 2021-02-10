package com.exercises.testing.forum.tdd;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.exercises.testing.forum.ForumComment;
import com.exercises.testing.forum.ForumPost;
import com.exercises.testing.forum.ForumUser;

public class ForumTestSuite {
	private static int testCounter = 0;
	
	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("This is the beginning of tests!");
	}
	
	@AfterClass
	public static void afterAllTests() {
		System.out.println("Tests are already done");
	}
	
	@Before
	public void beforeEveryTest() {
		testCounter++;
		System.out.println("Preparing to execute test #" + testCounter);
	}
	
	@Test
	public void testAddPost() {
		//Given
		ForumUser user = new ForumUser("Andrzej","Patryk Pastor");
		//When
		user.addPost("Andrzej", "My first content, Hello!");
		//Then
		Assert.assertEquals(1,user.getPostsQuantity());
	}
	
	@Test
	public void testAddComment() {
		//GIven
		ForumUser user = new ForumUser("Andrzej","Patryk Pastor");
		ForumPost forumPost = new ForumPost("My first content, Hello!", "Andrzej");
		//When
		user.addComment(forumPost,"Melanie","Crisis do not exist!");
		//Then
		Assert.assertEquals(1,user.getCommentsQuantity());
	}
	
	@Test
	public void testGetPost() {
		//Given
		ForumUser user = new ForumUser("Andrzej","Patryk Pastor");
		ForumPost forumPost = new ForumPost("My second content, Hello!", "Andrzej");
		user.addPost(forumPost.getAuthor(), forumPost.getPostBody() );
		//When
		ForumPost retrievedPost = user.getPost(0);
		//Then
		Assert.assertEquals(forumPost, retrievedPost);		
	}
	
	@Test
	public void testGetComment() {
		//Given
		ForumUser user = new ForumUser("Andrzej","Patryk Pastor");
		ForumPost forumPost = new ForumPost("My second content, Hello!", "Andrzej");
		ForumComment forumComment = new ForumComment(forumPost,"My first comment", forumPost.getAuthor());
		user.addComment(forumPost, forumPost.getAuthor(), forumComment.getCommentBody());
		//When
		ForumComment retrievedComment = user.getComment(0);
		//Then
		Assert.assertEquals(forumComment, retrievedComment);
	}
	
	@Test
	public void testRemovePostNotExisting() {
		//Given
		ForumUser user = new ForumUser("Andrzej","Patryk Pastor");
		ForumPost forumPost = new ForumPost("My second content, Hello!", "Andrzej");		
		//When
		boolean result = user.removePost(forumPost);
		//Then
		Assert.assertFalse(result);		
	}
	
	@Test
	public void testRemoveCommentNotExisting() {
		//Given
		ForumUser user = new ForumUser("Andrzej","Patryk Pastor");
		ForumPost forumPost = new ForumPost("My second content, Hello!", "Andrzej");
		ForumComment forumComment = new ForumComment(forumPost,"My first comment", forumPost.getAuthor());
		//When
		boolean result = user.removeComment(forumComment);
		//Then
		Assert.assertFalse(result);		
	}
	
	@Test
	public void testRemovePost() {
		//Given
		ForumUser user = new ForumUser("Andrzej","Patryk Pastor");
		ForumPost forumPost = new ForumPost("My second content, Hello!", "Andrzej");
		user.addPost(forumPost.getAuthor(), forumPost.getPostBody());
		//When
		boolean result = user.removePost(forumPost);
		//Then
		Assert.assertTrue(result);
		Assert.assertEquals(0,user.getPostsQuantity());
	}
	
	@Test
	public void testRemoveComment() {
		//Given
		ForumUser user = new ForumUser("Andrzej","Patryk Pastor");
		ForumPost forumPost = new ForumPost("My second content, Hello!", "Andrzej");
		ForumComment forumComment = new ForumComment(forumPost,"My first comment", forumPost.getAuthor());
		user.addComment(forumPost, forumPost.getAuthor(), forumComment.getCommentBody());
		//When
		boolean result = user.removeComment(forumComment);
		//Then
		Assert.assertTrue(result);
		Assert.assertEquals(0,user.getCommentsQuantity());
	}
}
