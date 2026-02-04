package com.example.finance_tracker_backend.dto;

import java.time.LocalDate;

public class TransactionDTO {

    private String description;
    private double amount;
    private String type; // INCOME or EXPENSE
    private LocalDate date;

    public TransactionDTO(String description, double amount, String type, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }
}
