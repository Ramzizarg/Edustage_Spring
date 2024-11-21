package com.example.project.entite;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String meetLink;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;


    public Reservation() {
    }

    public Reservation(LocalDateTime startTime, LocalDateTime endTime, String meetLink, Status status, User student, User teacher, Course course) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetLink = meetLink;
        this.status = status;
        this.student = student;
        this.teacher = teacher;
        this.course = course;
    }


}
