package entities;

import java.util.Date;

public class Account {
	private int number;
	private String holder;
	private float balance;
	private Date lastUpdate;
	private String password;	// even known it is not secure to store in object

	// Constructors
	public Account(int number, String holder, float deposit, String password) {
		this.number = number;
		this.holder = holder;
		this.balance += deposit;
		this.password = password;
		lastUpdate = new Date();
		//update();
	}
	public Account(int number, String holder, String password) {
		this.number = number;
		this.holder = holder;
		this.password = password;
		lastUpdate = new Date();
		//update();
		}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public float getBalance() {
		return balance;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	// Balance
	public void deposit(float value) {
		this.balance +=  value;
		getData();
	}
	public void withdraw(float value) {
		this.balance -=  (value + 5.00);
	}
	// Account Data
	public void getData() {
		System.out.printf("%n------------%nAccount data:%n Number: %d%n   Name: %s%nBalance: %.2f USD%nUpdate: %s%n------------%n", getNumber(), getHolder(), getBalance(),getLastUpdate().toString());
	}
	// Check password
	public boolean checkPassword(String password) {
		return this.password.equals(password) ? true : false;
	}
	
}
