package com.example.finance_tracker_backend.service;

import com.example.finance_tracker_backend.model.Expense;
import com.example.finance_tracker_backend.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getExpensesForUser(String userEmail) {
        return expenseRepository.findByUserEmail(userEmail);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
