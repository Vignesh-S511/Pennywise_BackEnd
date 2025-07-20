package com.fintrack.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fintrack.finance.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
}
