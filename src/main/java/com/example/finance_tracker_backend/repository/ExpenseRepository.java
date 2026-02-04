package com.example.finance_tracker_backend.repository;

import com.example.finance_tracker_backend.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByUserEmail(String userEmail);
}
