package com.fintrack.finance.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fintrack.finance.entity.Category;
import com.fintrack.finance.entity.Transaction;
import com.fintrack.finance.entity.User;
import com.fintrack.finance.repo.CategoryRepo;
import com.fintrack.finance.repo.TransactionRepo;
import com.fintrack.finance.repo.UserRepo;

@Service
public class TransactionService {
	
	 	@Autowired
	    private TransactionRepo transactionRepo;

	    @Autowired
	    private UserRepo userRepo;

	    @Autowired
	    private CategoryRepo categoryRepo;

	public Transaction createTransaction(int amount, String type,Date date,int userId,int categoryId) {
		 User user = userRepo.findById(userId)
	                .orElseThrow(() -> new RuntimeException("User not found"));
		 System.out.println(user);
		 System.out.println(user.getEmail());
		 Category category = categoryRepo.findById(categoryId)
	                .orElseThrow(() -> new RuntimeException("Category not found"));

	        Transaction transaction = new Transaction();
	        transaction.setAmount(amount);
	        transaction.setType(type);
	        transaction.setDate(date);
	        transaction.setUser(user);
	        transaction.setCategory(category);

	        return transactionRepo.save(transaction);
	}

}
