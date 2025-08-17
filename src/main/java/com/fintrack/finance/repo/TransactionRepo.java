package com.fintrack.finance.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.fintrack.finance.entity.Transaction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TransactionRepo extends JpaRepository<Transaction,Integer> {
    Optional<Transaction> findByIdAndUserId(int id, int userId);
    List<Transaction> findByDateBetweenAndUserId(LocalDateTime startDate, LocalDateTime endDate, int userId);

}
