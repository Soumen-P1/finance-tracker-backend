package com.example.finance_tracker_backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private double amount;

    private String category;

    private LocalDate date;

    private String userEmail; // extracted from JWT

    public Expense() {}

    public Expense(String title, double amount, String category, LocalDate date, String userEmail) {
        this.title = title;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.userEmail = userEmail;
    }

    // getters & setters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
