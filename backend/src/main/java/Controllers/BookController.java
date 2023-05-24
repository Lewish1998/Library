package Controllers;

import Models.Book;
import Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value="/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);

    }

    @GetMapping(value="/books/{id}")
    public ResponseEntity<Optional<Book>> getBook(@RequestBody Long id){
        return new ResponseEntity<>(bookRepository.findById(id), HttpStatus.OK);
    }

}
