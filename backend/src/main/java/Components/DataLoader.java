package Components;

import Models.Book;
import Models.GenreType;
import Models.Review;
import Repositories.BookRepository;
import Repositories.ReviewRepository;
import Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookRepository bookRepository;
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void run(ApplicationArguments args){

        Review review1 = new Review("A classic for a reason", "Roberta Small", 5);
        reviewRepository.save(review1);


        Book book1 = new Book("Pride and Prejudice", "Jane Austen", GenreType.ROMANCE, "Set in early 19th-century England, \"Pride and Prejudice\" follows the lively Elizabeth Bennet as she navigates the societal expectations, manners, and romantic entanglements of her time. Through witty dialogue and sharp social commentary, Austen explores themes of love, marriage, and class.", "https://images.squarespace-cdn.com/content/v1/58c180edff7c50dd0e51a2ad/1596042032039-IN7LLXRVDKGVC854LVHE/9780241375273.jpg", new ArrayList<>(), 5);

        bookRepository.save(book1);
        book1.addReview(review1);
        bookRepository.save(book1);


    }
}
