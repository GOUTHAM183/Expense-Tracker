package com.goutham.expensetracker.expenses.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "expenses")
public class Expense {
    @Id
    private String id;

    private String description;
    private double amount;
    private LocalDate date;

    // Constructors, getters, setters

    public Expense() {
    }

    public Expense(String description, double amount, LocalDate date) { // Adjust constructor
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
