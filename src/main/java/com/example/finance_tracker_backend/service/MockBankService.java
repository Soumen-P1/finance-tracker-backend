package com.example.finance_tracker_backend.service;

import com.example.finance_tracker_backend.dto.TransactionDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MockBankService {

    public List<TransactionDTO> getTransactions() {
        return List.of(
                new TransactionDTO("Salary", 40000, "INCOME", LocalDate.now().minusDays(5)),
                new TransactionDTO("Groceries", 5000, "EXPENSE", LocalDate.now().minusDays(3)),
                new TransactionDTO("Rent", 10000, "EXPENSE", LocalDate.now().minusDays(2)),
                new TransactionDTO("Freelance", 8000, "INCOME", LocalDate.now().minusDays(1))
        );
    }
}
