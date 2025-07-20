package com.fintrack.finance.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.finance.dto.TransactionRequestDTO;
import com.fintrack.finance.entity.Transaction;
import com.fintrack.finance.service.TransactionService;

@RestController
class TransactionController{
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/addTransaction")
	public ResponseEntity<Transaction> addTransactionEntry(@RequestBody TransactionRequestDTO request) {
	    Transaction transaction = transactionService.createTransaction(request.getAmount(),request.getType(),request.getDate(), request.getUserId(),
	            request.getCategoryId());
	    return ResponseEntity.ok(transaction);
	}

}