package org.jsp.bank_atm;
import java.util.Scanner;
public class Bank_Driver {
  public static void main(String args[]) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter bank name to open account");
	  String bname=s.next();
	  System.out.println("Enter address of bank");
	  String loc=s.next();
	  System.out.println("Enter bank ifsc_code");
	  String ifsc=s.next();
	  Bank b=new Bank(bname,loc,ifsc);
	  
	  boolean option=true;
	  while(option) 
	  {
		  System.out.println("Enter your choice");
		  System.out.println(" enter 1. for create account");
		  System.out.println("enter 2. for check details");
		  System.out.println("enter 3. for deposit money");
		  System.out.println("enter 4. for withdraw money");
		  System.out.println("enter 5. for delete account");
		  System.out.println("enter 6. for exit & close");
		  
		  int choice=s.nextInt();
		  switch(choice) {
		  case 1:{
			  System.out.println("enter name");
			  String name=s.next();
			  System.out.println("enter dob");
			  String dob=s.next();
			  System.out.println("enter pin");
			  String pin=s.next();
			  System.out.println("enter money to deposit");
			  double money=s.nextDouble();
			  System.out.println("enter account number of your choice");
			  long ano=s.nextLong();
			  b.createAccount(new Account(name, dob, pin, money, ano));
			  System.out.println("********************************");
		  }
		  break;
		  case 2:{
			  b.bankDetails();
			  System.out.println("*******************************");
		  }
		  break;
		  case 3:{
			  System.out.println("enter account number to deposit money");
			  long ano1=s.nextLong();
			  System.out.println("enter how much money you want to deposit");
			  double money1=s.nextDouble();
			  b.Deposit(ano1,money1);
			  System.out.println("*******************************");
		  }
		  break;
		  case 4:{
			  System.out.println("enter account number to withdraw money");
			  long ano1=s.nextLong();
			  System.out.println("enter how much money you want to withdraw");
			  double money1=s.nextDouble();
			  b.Withdraw(ano1, money1);
			  System.out.println("****************************");
			  }
		  break;
		  case 5:{
			  b.DeleteAccount();
		  }
		  break;
		  case 6:{
			  System.out.println("thankyou for using" +bname);
			  System.out.println("having a good day)!!!");
			  option=false;
		  }
		  break;
		  default:{
			  System.out.println("enter your valid choice");
			  break;
		  }
		  }
		  
	  }
  }
}
