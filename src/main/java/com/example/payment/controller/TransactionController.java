package com.example.payment.controller;

import com.example.payment.domain.Transaction;
import com.example.payment.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping("/transactions")
    public ResponseEntity create(@RequestBody Transaction transaction) {
        Transaction result = service.save(transaction);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/transactions")
    public ResponseEntity getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/transactions/test")
    public ResponseEntity getMsg() {
        return ResponseEntity.ok(service.findAll());
    }
}
