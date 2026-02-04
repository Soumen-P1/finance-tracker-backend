package com.example.finance_tracker_backend.controller;

import com.example.finance_tracker_backend.dto.TransactionDTO;
import com.example.finance_tracker_backend.service.MockBankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bank")
public class BankController {

    private final MockBankService bankService;

    public BankController(MockBankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/transactions")
    public List<TransactionDTO> getTransactions() {
        return bankService.getTransactions();
    }
}
