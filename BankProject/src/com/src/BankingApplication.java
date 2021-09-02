package com.src;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {

		String name="Vasumathi T";
		String id="78675768898";
		String type="Savings";
		//System.out.println("Name= "+name + "\n" + "ActNo= " +id + "\n" +"Type= "+ type);
		BankAccountDetails b=new BankAccountDetails(name,id,type);
		b.showMenu();
	}

}
class BankAccountDetails {
	String CustomerName;
	String CustomerAcno;
	int balance;
	int previousTransaction;
	String AcctType;
	
	
	public BankAccountDetails(String cName, String cId,String type) {
		CustomerName = cName;
		CustomerAcno = cId;
		AcctType=type;
	}

	void deposite(int amount) {
		if(amount!=0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount>balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance=balance-amount;
			previousTransaction=-amount;
		}
		
	}
	
	void getPreviousTransaction() {
		if(previousTransaction>0)
		{
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction<0)
		{
			System.out.println("withdrawn: "+ Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No Transcation Processed");
		}
		
	}
	
	void showMenu()
	{
		char option='\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome "+CustomerName);
		System.out.println("Your AcNo is "+CustomerAcno);
		System.out.println("Type: "+AcctType);
		System.out.println("\n");
		System.out.println("A, Check Balance");
		System.out.println("B, Deposite");
		System.out.println("C, Withdraw");
		System.out.println("D, Previous Transaction");
		System.out.println("E, Exit");
		do
		{
			System.out.println("------------------------------------------------");
			System.out.println("Enter your option: ");
			option=sc.next().charAt(0);
			switch(option)
			{
			
			case 'A' :
				System.out.println("Balance: "+balance);
				System.out.println("\n");
				break;
				
			case 'B':
				//System.out.println("-------------------------------------------");
				System.out.println("Enter your amount:");
				int amount=sc.nextInt();
				deposite(amount);
				System.out.println("\n");
				break;
			
			case 'C':
				//System.out.println("--------------------------------------------");
				System.out.println("Enter your amount:");
				int amount2=sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				//System.out.println("--------------------------------------------");
				getPreviousTransaction();
				System.out.println("\n");
				break;
			
			case 'E':
				System.out.println("********************************************");
				break;
			
			default:
				System.out.println("Invalid option:Enter Valid information");
				break;
				
			}
			
		}while(option!='E');
		
		System.out.println("Thank You for using our service");
	}
}
