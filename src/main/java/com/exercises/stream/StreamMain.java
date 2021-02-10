package com.exercises.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.exercises.stream.forumuser.Forum;
import com.exercises.stream.forumuser.ForumUser;
import com.exercises.stream.immutable.Book;
import com.exercises.stream.immutable.BookDirectory;
import com.exercises.stream.person.People;

public class StreamMain {
	public static void main(String[] args) {
		People.getList().stream()
			.map(String::toUpperCase)
			.filter(s -> s.length() > 11)
			.map(s -> s.substring(0, s.indexOf(" ") + 2) + ".")
			.filter(s -> s.substring(0,1).equals("M"))
			.forEach(System.out::println);
		
		BookDirectory bookDirectory = new BookDirectory();
		List<Book> resultListOfBooks = bookDirectory.getList().stream()
					.filter(book -> book.getYearOfPublication() > 2005)
					.collect(Collectors.toList());
		
		System.out.println("#elements: " + resultListOfBooks.size());
		resultListOfBooks.stream()
			.forEach(System.out::println);
		
		Map<String, Book> resultMapOfBooks = bookDirectory.getList().stream()
				.filter(book -> book.getYearOfPublication() > 2005)
				.collect(Collectors.toMap(Book::getSignature, book -> book));
		
		System.out.println("#Elements = " + resultMapOfBooks.size());
		resultMapOfBooks.entrySet().stream()
			.map(entry -> entry.getKey() + ": " + entry.getValue())
			.forEach(System.out::println);
		
		String theResultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
				
        Forum forum = new Forum();
        
        Map<Integer, ForumUser> resultMapOfForumUsers = forum.getUserList().stream()
        		.filter(user -> user.getSex() == 'M')
        		.filter(user -> user.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
        		.filter(user -> user.getNumberOfPosts() > 0)
        		.collect(Collectors.toMap(ForumUser::getUserId, user -> user));
        
        resultMapOfForumUsers.entrySet().stream()
        	        	.forEach(System.out::println);
	}
}
