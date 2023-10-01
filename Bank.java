package org.jsp.bank_atm;

public class Bank {
String bname;
String loc;
String ifsc_code;
Account a;
public Bank(String bname, String loc, String ifsc_code) {
	super();
	this.bname =bname;
	this.loc = loc;
	this.ifsc_code = ifsc_code;
}
public void bankDetails() {
	System.out.println("bname :"+bname);
	System.out.println("loc :"+loc);
	System.out.println("ifsc_code :"+ifsc_code);
  
  if(a!=null) {
	  System.out.println("name :"+a.account_holder_name);
	  System.out.println("dob :"+a.dob);
	  System.out.println("pin :"+a.pin);
	  System.out.println("money :"+a.money);
  }
  else {
	  System.out.println("Open your account first");
    }
  }
  public void createAccount(Account a) {
	  if(this.a==null) {
		  this.a=a;
		  System.out.println("Account successfully created");
	  }
	  else {
		  System.out.println("Already account is existing");
	  }
  }
  public void Deposit(long ano,double money) {
	  if(a.ano==ano) {
		  if(money!=0) {
			  a.money=a.money+money;
			  System.out.println("deposit amount is "+money);
			  System.out.println("total balance is "+a.money);
		  }else {
			  System.out.println("enter valid account to add in account");}
		  }
		  else {
			  System.out.println("enter valid account number");
		  }
	  }
	  public void Withdraw(long ano,double money) {
		  if(a.ano==ano) {
			  if(a.money>=money) {
				  a.money=a.money-money;
				  System.out.println("withdraw amount is "+money);
				  System.out.println("total balance is "+a.money);
			  }else {
				  System.out.println("Insufficient balance!");}
			  }
		  else {
			  System.out.println("enter valid amount to add in account");
		  }
  }
	  public void DeleteAccount() {
		  this.a=null;
		  System.out.println("account deleted");
	  }
}
