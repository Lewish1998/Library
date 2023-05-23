package com.Library;

import com.Library.Models.Book;
import org.aspectj.lang.annotation.Before;

public class BookTest {
    Book book1;

    @Before
    public void before(){
        book1 = new Book("Book1", "Lewis", 5, true){
            assertEquals("Book1", book1.get)
        }
    }
}
