package com.example.payment.repository;

import com.example.payment.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
