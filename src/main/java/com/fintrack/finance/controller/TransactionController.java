package com.fintrack.finance.controller;

import com.fintrack.finance.dto.TransactionDTO;
import com.fintrack.finance.entity.Transaction;
import com.fintrack.finance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TransactionController{
	
	@Autowired
	TransactionService transactionService;
	@PostMapping("/transaction")
	public ResponseEntity<Transaction> addTransactionEntry(@RequestBody TransactionDTO request) {
	    Transaction transaction = transactionService.createTransaction(request);
	    return ResponseEntity.ok(transaction);
	}
	
}