package com.fintrack.finance.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fintrack.finance.entity.Category;

public interface CategoryRepo  extends JpaRepository<Category, Integer>{

}
