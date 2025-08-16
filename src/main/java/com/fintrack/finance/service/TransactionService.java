package com.fintrack.finance.service;

import com.fintrack.finance.dto.TransactionDTO;
import com.fintrack.finance.entity.Category;
import com.fintrack.finance.entity.Transaction;
import com.fintrack.finance.entity.User;
import com.fintrack.finance.repo.CategoryRepo;
import com.fintrack.finance.repo.TransactionRepo;
import com.fintrack.finance.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class TransactionService {

    private final TransactionRepo transactionRepo;
    private final UserRepo userRepo;
    private final CategoryRepo categoryRepo;

    @Autowired
    public TransactionService(TransactionRepo transactionRepo, UserRepo userRepo, CategoryRepo categoryRepo) {
        this.transactionRepo = transactionRepo;
        this.userRepo = userRepo;
        this.categoryRepo = categoryRepo;
    }

    public Transaction createTransaction(TransactionDTO requestDTO) {
        User user;
        Category category;
        try {
            user = userRepo.findById(requestDTO.getUserId()).get();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("User not found");
        }
        try {
            category = categoryRepo.findById(requestDTO.getCategoryId()).get();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Category not found");
        }
        Transaction transaction = new Transaction();
        transaction.setAmount(requestDTO.getAmount());
        transaction.setType(requestDTO.getType());
        transaction.setDate(requestDTO.getDate());
        transaction.setUser(user);
        transaction.setCategory(category);
        return transactionRepo.save(transaction);
    }


}
