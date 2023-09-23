package main;

import java.sql.Date;

public class TransactionHeader {
	private Integer transactionID,userID;
	private Date transactionDate;
	
	public TransactionHeader(Integer transactionID, Integer userID, Date transactionDate) {
		this.transactionID = transactionID;
		this.userID = userID;
		this.transactionDate = transactionDate;
	}
	public Integer getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	
	
}
