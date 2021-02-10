package com.exercises.testing.library;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookLibraryTestSuite {
	@Mock
	private LibraryDatabase libraryDatabaseMock;
	@Test
    public void testListBooksWithConditionsReturnList() {
		//Given
		//LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class); <--- JUnit4
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		List<Book> resultBookList = new ArrayList<Book>();
		Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
	    Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
	    Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
	    Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
	    resultBookList.add(book1);
	    resultBookList.add(book2);
	    resultBookList.add(book3);
	    resultBookList.add(book4);
	    when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultBookList);
	    //When
	    List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
	    //Then
        assertEquals(4,theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
    	//LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class); <--- JUnit 4
    	BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    	List<Book> resultListOf0books = new ArrayList<Book>();
    	List<Book> resultListOf15books = generateListOfNBooks(15);
    	List<Book> resultListOf40books = generateListOfNBooks(40);
    	when(libraryDatabaseMock.listBooksWithCondition(Mockito.anyString())).thenReturn(resultListOf15books);
    	when(libraryDatabaseMock.listBooksWithCondition("Zero books")).thenReturn(resultListOf0books);
    	when(libraryDatabaseMock.listBooksWithCondition("Forty books")).thenReturn(resultListOf40books);
    	//When
    	List<Book> listOf0books = bookLibrary.listBooksWithCondition("Zero books");
    	List<Book> listOf15books = bookLibrary.listBooksWithCondition("Any title");
    	List<Book> listOf40books = bookLibrary.listBooksWithCondition("Forty books");
    	//Then
    	assertEquals(0,listOf0books.size());    	
    	assertEquals(15,listOf15books.size());    	
    	assertEquals(0,listOf40books.size());    	
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
    	//Given
    	BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    	//List<Book> resultListOf10Books = generateListOfNBooks(10);
    	//when(libraryDatabaseMock.listBooksWithCondition(Mockito.anyString())).thenReturn(resultListOf10Books);
    	//When
    	List<Book> theListOf10Books = bookLibrary.listBooksWithCondition("an");
    	//Then
    	assertEquals(0, theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(Mockito.anyString());
    }
    
    @Test
    public void testListBooksInHandsOfWithoutBooks() {  
    	//Given
    	LibraryUser libraryUser = new LibraryUser("Patryk","Pastor", "123456789");
    	BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    	List<Book> resultListBooksEmpty = new ArrayList<Book>();
    	when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListBooksEmpty);
    	//When
    	List<Book> emptyList = bookLibrary.listBooksInHandsOf(libraryUser);
    	//Then
    	assertEquals(0, emptyList.size());
    }
    
    @Test
    public void testListBooksInHandsOfWithOneBook() {
    	//Given
    	LibraryUser libraryUser = new LibraryUser("Patryk","Pastor", "123456789");
    	BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    	List<Book> resultListBooksOneBook = generateListOfNBooks(1);
      	when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListBooksOneBook);
    	//When
    	List<Book> listBooksOneBook = bookLibrary.listBooksInHandsOf(libraryUser);
    	//Then
    	assertEquals(1, listBooksOneBook.size());
    }
    
    @Test
    public void testListBooksInHandsOfWithFiveBooks() {
    	//Given
    	LibraryUser libraryUser = new LibraryUser("Patryk","Pastor", "123456789");
    	BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    	List<Book> resultListBooksFiveBooks = generateListOfNBooks(5);
      	when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListBooksFiveBooks);
    	//When
    	List<Book> listBooksFiveBooks = bookLibrary.listBooksInHandsOf(libraryUser);
    	//Then
    	assertEquals(5, listBooksFiveBooks.size());
    }
    
    private List<Book> generateListOfNBooks(int quantityOfBooks) {
    	List<Book> resultList = new ArrayList<Book>();
    	for(int i = 0 ; i < quantityOfBooks ; i++) {
    		Book book = new Book("Author" + i, "Title" + i, 1960 + i);
    		resultList.add(book);
    	}
    	return resultList;
    }

}
