package db.models;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 60, name = "username")
    private String name;

    @Column(nullable = false, length = 60, name = "password")
    private int pass;

    @Column(nullable = false, unique = true, name = "eMail")
    private String email;

    public User() {

    }

    public User(String name, int pass, String email) {
        this.name = name;
        this.pass = pass;
        this.email = email;
    }
}
