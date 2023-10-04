package atm;
import java.util.Scanner;

public class ATMInterface {
	
	
	    public static String transaction[]=new String[10];
	    public static int transactioncount;
	    public static void atminterface()
	    {
	        Scanner sc=new Scanner(System.in);
	        int x,pin,entry;
	        pin = 12345;
	        System.out.println("Welcome to Indian Bank ATM Machine!");
	        System.out.println("Enter your ATM pin.");
	        entry = sc.nextInt();
	        if (pin != entry)
	        {
	            System.out.println("Incorrect pin.");
	            System.out.println("Enter your atm pin:");
	            entry = sc.nextInt();
	        }
	        else
	        {
	        System.out.println("Correct pin.");
	        }
	       
	        System.out.println("..............WELCOME Josita Sengupta..............");
	        System.out.println("Type 1 to start transaction:");
	        x=sc.nextInt();
	        int  Withdraw=0, Deposit=0, Transfer=0,   Balance;
	        Balance=100000;
	        String account_holder="";
	        while(x==1)
	        {

	            System.out.println("Select 1 to Withdraw");
	            System.out.println("Select 2 to Deposit");
	            System.out.println("Select 3 to Transfer");
	            System.out.println("Select 4 for Transaction history");
	            System.out.println("Select 5 to Quit");  
	            System.out.println("Choose any of the above operations:");
	            
	            int choice = sc.nextInt();  
	            switch(choice)
	            
	            {
	                case 1:
	                System.out.println("Enter money to be withdrawn:");
	                Withdraw = sc.nextInt();   
	                if (Balance>=Withdraw)
	                {
	                    Balance=Balance-Withdraw;
	                    System.out.println("Please collect your money!");
	                    transactionupdate("Withdrawal:"+Withdraw);
	                }
	                else 
	                {
	                    System.out.println("Insufficient Balance.");
	                }
	                System.out.println("Remaining balance:"+Balance+"");
	                
	                break;

	                case 2:
	                System.out.println("Enter amount of money to be deposited:");
	                Deposit = sc.nextInt();
	                Balance=Deposit+Balance;
	                System.out.println("Your money has been depositted sucessfully.");
	                System.out.println("Remaining balance:"+Balance+"");
	                transactionupdate("Deposit:"+Deposit);
	                
	                break;

	                case 3:
	                System.out.println("Enter amount of money to be transfered:");
	                Transfer = sc.nextInt();
	                
	                if (Balance>=Transfer)
	                {
	                    System.out.println("Enter the account holder name:");
	                    account_holder = sc.next();
	                    Balance=Balance-Transfer;
	                    System.out.println("Amount transfered to:"+account_holder+"");
	                    transactionupdate("Transfer:"+Transfer);
	                }
	                else 
	                {
	                    System.out.println("Amount is not transfered due to insufficient balance:"); 
	                }
	                System.out.println("Remaining balance:"+Balance+"");
	                
	                
	                break;

	                case 4:
	                for(int i=0;i<transactioncount;i++)
	                {
	                    System.out.println(transaction[i]);
	                }
	             
	                break;

	                case 5:
	                System.exit(0);
	            }
	            System.out.println("Press 1 to continue transaction and 0 to end transaction:");
	            x=sc.nextInt();
	        }
	        sc.close();
	    }
	    public static void transactionupdate(String x)
	    {
	        transaction[transactioncount]=x;
	        transactioncount++;
	    }
	    public static void main(String[] args)
	    {
	        atminterface();
	    }   
	}


