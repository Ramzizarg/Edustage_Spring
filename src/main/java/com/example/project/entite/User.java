package com.example.project.entite;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class User  {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String password;

        @Enumerated(EnumType.STRING)
        private Role role;

        private String email;

        @OneToMany(mappedBy = "teacher")
        private Set<Course> courses;

        @OneToMany(mappedBy = "student")
        private Set<Reservation> reservations;

}
