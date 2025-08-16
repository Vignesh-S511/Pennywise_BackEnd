package com.fintrack.finance.repo;
import org.springframework.data.repository.CrudRepository;

import com.fintrack.finance.entity.Transaction;

public interface TransactionRepo extends CrudRepository<Transaction,Integer>{

}
