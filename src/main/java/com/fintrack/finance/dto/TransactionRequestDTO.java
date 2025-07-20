package com.fintrack.finance.dto;

import java.util.Date;

public class TransactionRequestDTO {
    private int amount;
    private String type;
    private Date date;
    private int userId;
    private int categoryId;

    public int getAmount() 
    {
    	return amount; 
    }
    public void setAmount(int amount) 
    { 
    	this.amount = amount; 
    }
    public String getType() 
    { 
    	return type; 
    }
    public void setType(String type) 
    { 
    	this.type = type; 
    }
    public Date getDate() 
    { 
    	return date; 
    }
    public void setDate(Date date)
    { 
    	this.date = date; 
    }
    public int getUserId() 
    { 
    	return userId; 
    }
    public void setUserId(int userId) 
    { 
    	this.userId = userId; 
    }
    public int getCategoryId() 
    { 
    	return categoryId; 
    }
    public void setCategoryId(int categoryId) 
    { 
    	this.categoryId = categoryId; 
    }
}
