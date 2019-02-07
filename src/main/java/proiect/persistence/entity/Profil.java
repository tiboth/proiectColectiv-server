package proiect.persistence.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Profil implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private String mobileNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private boolean freigegeben;

    public Profil(String region, boolean freigegeben) {
        this.region = region;
        this.freigegeben = freigegeben;
    }

    @Override
    public String toString() {
        return "Profil{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
