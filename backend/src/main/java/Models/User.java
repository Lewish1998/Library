package Models;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table (name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column (name="name")
    private String name;
    @Column (name = "email")
    private String email;
    @Column(name="password")
    private String password;
    @Column (name="address")
    private String address;
    @Column (name="borrowing")
    private List<Book> borrowing;




    public User(String name, String email, String password, String address, List<Book> borrowing){
        this.name = name;
        this.email= email;
        this.password = password;
        this.address = address;
        this.borrowing = borrowing;
    }

    public User() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail_address(String email_address) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBorrowing() {
        return borrowing;
    }

    public void setBorrowing(List<Book> borrowing) {
        this.borrowing = borrowing;
    }
}
