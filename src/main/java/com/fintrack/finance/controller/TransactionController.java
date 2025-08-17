package com.fintrack.finance.controller;

import com.fintrack.finance.dto.TransactionDTO;
import com.fintrack.finance.entity.Transaction;
import com.fintrack.finance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/getTransaction")
public class TransactionController{

	@Autowired
	TransactionService transactionService;
	@PostMapping("/transaction")
	public ResponseEntity<Transaction> addTransactionEntry(@RequestBody TransactionDTO request) {
	    Transaction transaction = transactionService.createTransaction(request);
	    return ResponseEntity.ok(transaction);
	}

	@GetMapping("/getTransaction/{userId}/{id}")
	public Transaction showTransactionById(@PathVariable int id,@PathVariable int userId) {
		return transactionService.readTransactionById(id,userId);
	}


	@GetMapping("/{userId}")
	public List<String > showTransactionByDateRange(
			@PathVariable int userId){

		Date date = new Date();  // current date and time
			System.out.println("java.util.Date: " + date);
		return List.of("User ID: " + userId, "Date: " + date.toString());
	}

}

