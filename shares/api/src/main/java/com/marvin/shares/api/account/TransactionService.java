package com.marvin.shares.api.account;

import com.marvin.core.account.application.domain.transaction.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/transaction")
public interface TransactionService {
    @PostMapping
    public void addTransaction(@RequestBody Transaction body);

//    @GetMapping("/amount/{amount}")
//    public List<Transaction> getTransactionByAmount(@PathVariable("amount") int amount);
}
