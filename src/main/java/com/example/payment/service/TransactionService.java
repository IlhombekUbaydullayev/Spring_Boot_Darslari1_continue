package com.example.payment.service;

import com.example.payment.domain.Transaction;
import com.example.payment.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction save(Transaction transaction) {
        return repository.save(transaction);
    }

    public List<Transaction> findAll() {
        return repository.findAll();
    }

}

