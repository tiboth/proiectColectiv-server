package proiect.persistence.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    @JsonIgnore
    private Set<User> users = new HashSet<>();

    @OneToMany
    @JsonIgnore
    private List<Skill> skills = new ArrayList<>();

    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

//    public User(String username, String email, String password, int salary) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.salary = salary;
//    }

    public User(List<Skill> skills, String username, String email, String password, int salary) {
        this.skills = skills;
        this.username = username;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    @Column(nullable = false)
    private int salary;


    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", skills=" + skills +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                '}';
    }
}
