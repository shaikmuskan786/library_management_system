package com.library.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String author;
    private boolean borrowed;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User borrowedBy;


    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowedBy(User user) {
    }

    public void setBorrowed(boolean b) {
    }
}