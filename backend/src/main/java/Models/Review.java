package Models;

import jakarta.persistence.*;

@Entity
@Table (name="reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column (name="review")
    private String review;
    @Column(name="author")
    private String author;
    @Column(name="rating")
    private int rating;

    public Review(String review, String author, int rating){
        this.review = review;
        this.author = author;
        this.rating = rating;
    }

    public Review() {
    }
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
