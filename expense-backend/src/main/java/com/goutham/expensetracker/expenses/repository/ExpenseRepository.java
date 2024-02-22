package com.goutham.expensetracker.expenses.repository;


import com.goutham.expensetracker.expenses.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
}

