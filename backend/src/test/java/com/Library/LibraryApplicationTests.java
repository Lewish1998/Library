package com.Library;

import Models.Book;
import Models.GenreType;
import Repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LibraryApplicationTests {


	@Autowired
	private BookRepository bookRepository;

	@Test
	void contextLoads() {

	}


	@Test
	public void getNumberOfBooks() {
		Book book1 = new Book("Pride and Prejudice", "Jane Austen", GenreType.ROMANCE, "Set in early 19th-century England, \"Pride and Prejudice\" follows the lively Elizabeth Bennet as she navigates the societal expectations, manners, and romantic entanglements of her time. Through witty dialogue and sharp social commentary, Austen explores themes of love, marriage, and class.", "https://images.squarespace-cdn.com/content/v1/58c180edff7c50dd0e51a2ad/1596042032039-IN7LLXRVDKGVC854LVHE/9780241375273.jpg", new ArrayList<>(), 5);
		bookRepository.save(book1);
		List books = bookRepository.findAll();
		assertEquals(1, books.size());
	}


}
