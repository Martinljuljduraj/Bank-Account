// Martin Ljuljduraj 
// ATM - driver class for Account class using switch

import java.util.Scanner;
import java.util.Random;

public class AccountATM
{
   public static void main(String[] args)
   {
      // declare var
      int choice, PIN, ans;
      double money, balance;
      long accountNum;
      String name, answer;
      
      // instantiate objects
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      
      // get user input
      System.out.println("Let us open a bank account for you.");
      System.out.println("Enter your name.");
      name = scan.nextLine();
      System.out.println("Enter an opening balance.");
      balance = scan.nextDouble();
      PIN = 1234;// assigned as default
      accountNum = rand.nextLong();
      
      // instantiate Account object
      Account myAccount1 = new Account(name, accountNum, PIN, balance);
      
      // print out details of Account
      System.out.println(myAccount1);
      
      // initialize answer to "y"
      answer = "y";
      
      // loop
      while(answer.equals("y"))
      {
         System.out.println("1 for Deposit, 2 for Withdrawal, 3 for Change PIN, 4 for Balance Inquiry");
         choice = scan.nextInt();
         // switch structure
         switch(choice)
         {
            case 1:
                  {
                  System.out.println("Enter deposit amount.");
                  money = scan.nextDouble();
                  myAccount1.deposit(money);
                  }
                  break;
            case 2:
                  {
                  System.out.println("Enter withdrawal amount.");
                  money = scan.nextDouble();
                  ans = myAccount1.withdrawal(money);
                  if(ans == 0)
                     System.out.println("Insufficient Funds");
                  }
                  break;
            case 3:
                  {
                  System.out.println("Enter new PIN.");
                  PIN = scan.nextInt();
                  myAccount1.setPIN(PIN);
                  }
                  break;
            case 4:
                  {
                  System.out.println("Your balance is " + myAccount1.getBalance());
                  }
                  break;
            default:
                  System.out.println("Invalid Entry");
         }// end switch
         
         scan.nextLine();// this will catch the extra newline char after the int
         
         System.out.println("Ok. Do you want to do another transaction? Type y or n: ");
         answer = scan.nextLine();
      }// end while
      System.out.println("Have a nice day.");
   }// end main
}// end class