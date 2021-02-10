package com.exercises.stream.immutable;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTestSuite {

	@Test
	public void testGetListUsingFor() {
		//GIven
		BookDirectory bookDirectory = new BookDirectory();
		//When
		List<Book> books = bookDirectory.getList();		
		//Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book : books) {
        if (book.getYearOfPublication() > 2007) {
              numberOfBooksPublicatedAfter2007++;
           }
        }
        Assertions.assertEquals(3, numberOfBooksPublicatedAfter2007);
	}
	
	@Test
	public void testGetListUsingIntStream() {
	        //Given
	        BookDirectory bookDirectory = new BookDirectory();

	        //When
	        List<Book> books = bookDirectory.getList();

	        //Then
	        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
	                .filter(n -> books.get(n).getYearOfPublication() > 2007)
	                .count();
	        Assertions.assertEquals(3, numberOfBooksPublicatedAfter2007);
	}
}
