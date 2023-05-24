package com.Library.Components;

import com.Library.Models.Book;
import com.Library.Models.GenreType;
import com.Library.Models.Review;
import com.Library.Models.User;
import com.Library.Repositories.BookRepository;
import com.Library.Repositories.ReviewRepository;
import com.Library.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Profile("!Test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookRepository bookRepository;
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{


        Book book1 = new Book("Pride and Prejudice", "Jane Austen", GenreType.ROMANCE, "Through witty dialogue and sharp social commentary, Austen explores themes of love, marriage, and class.", "https://images.squarespace-cdn.com/content/v1/58c180edff7c50dd0e51a2ad/1596042032039-IN7LLXRVDKGVC854LVHE/9780241375273.jpg", new ArrayList<>(), 5);

        bookRepository.save(book1);

        User user1 = new User("Dianne Smith", "d.smith@gmail.com", "dianne", "21 Baker Street, London, W1U 8EQ", new ArrayList<Book>());
        userRepository.save(user1);

        Review review1 = new Review("A classic for a reason.", "Shaun Brookes", 5, book1.getId());
        reviewRepository.save(review1);

        book1.addReview(review1);
        bookRepository.save(book1);
    }
}
