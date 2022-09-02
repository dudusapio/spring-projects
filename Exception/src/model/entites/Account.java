package model.entites;

import model.exceptions.AmountExceedWithdrawLimit;
import model.exceptions.NotEnoughBalance;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount){
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws AmountExceedWithdrawLimit,NotEnoughBalance {
		if(amount > withdrawLimit) {
			throw new AmountExceedWithdrawLimit("The ammount exceeds withdraw limit!");
		}
		if(amount > balance) {
			throw new NotEnoughBalance("Not enough balance!");
		}
		this.balance -= amount;
	}
}
