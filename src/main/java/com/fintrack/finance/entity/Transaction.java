package com.fintrack.finance.entity;
import java.util.Date;
import com.fintrack.finance.dto.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float amount;
	@Enumerated(EnumType.STRING)
	private TransactionType type;
	private Date date; 
	private String description;
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)  
	private User user;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)  
	private Category category;


}
