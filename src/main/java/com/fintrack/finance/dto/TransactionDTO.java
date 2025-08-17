package com.fintrack.finance.dto;

import com.fintrack.finance.dto.TransactionType;
import lombok.Data;

import java.util.Date;

@Data
public class TransactionDTO {
	private int id;  
	private float amount;
	private TransactionType type; 
    private Date date;
    private int userId;
    private int categoryId;

}
