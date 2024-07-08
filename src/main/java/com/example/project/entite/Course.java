package com.example.project.entite;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String teacherName;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private User teacher;


}
