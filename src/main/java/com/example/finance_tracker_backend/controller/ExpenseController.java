package com.example.finance_tracker_backend.controller;

import com.example.finance_tracker_backend.model.Expense;
import com.example.finance_tracker_backend.security.JwtUtil;
import com.example.finance_tracker_backend.service.ExpenseService;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;
    private final JwtUtil jwtUtil;

    public ExpenseController(ExpenseService expenseService, JwtUtil jwtUtil) {
        this.expenseService = expenseService;
        this.jwtUtil = jwtUtil;
    }

    // ➕ ADD EXPENSE
    @PostMapping
    public Expense addExpense(
            @RequestBody Expense expense,
            HttpServletRequest request
    ) {
        String token = request.getHeader("Authorization").substring(7);
        Claims claims = jwtUtil.validateToken(token);
        String email = claims.getSubject();

        expense.setUserEmail(email);
        return expenseService.addExpense(expense);
    }

    // 📄 GET ALL EXPENSES (for logged-in user)
    @GetMapping
    public List<Expense> getExpenses(HttpServletRequest request) {
        String token = request.getHeader("Authorization").substring(7);
        Claims claims = jwtUtil.validateToken(token);
        String email = claims.getSubject();

        return expenseService.getExpensesForUser(email);
    }

    // ❌ DELETE EXPENSE
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }
}
