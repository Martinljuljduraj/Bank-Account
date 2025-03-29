// Martin Ljuljduraj  
// Menu option for Account class

import java.util.Scanner;

public class AccountMenu
{
   public static void main(String[] args)
   {
      // declare var
      String name, keepGoing = "yes";
      long acctNum;
      double balance, money;
      int PIN, optionMenu;
      
      // instantiate Scanner object
      Scanner scan = new Scanner(System.in);
      
      // get user input
      System.out.println("Enter your name: ");
      name = scan.nextLine();
      System.out.println("How much will you deposit to open your account?");
      balance = scan.nextDouble();
      System.out.println("You will get an initial PIN, which you can change.");
      
      // instantiate an Account object
      Account myAccount1 = new Account(name, 123456789, 1234, balance);
      
      // report on the status of the account
      System.out.println(myAccount1);
      
      // while loop for a menu option
      while(keepGoing.equals("yes"))
      {
         System.out.println("Menu");
         System.out.println("What do you want to do?");
         System.out.println("1. Deposit, 2. Withdrawal, 3. Change the PIN, 4. Balance");
         optionMenu = scan.nextInt();
         
         // Options 1-4
         if(optionMenu == 1)// deposit
         {
            System.out.println("How much do you want to deposit?");
            money = scan.nextDouble();
            myAccount1.deposit(money);// method call
            System.out.println(myAccount1);// report
         }
         
         if(optionMenu == 2)// withdrawal
         {
            System.out.println("How much do you want to withdraw? ");
            money = scan.nextDouble();
            int answer = myAccount1.withdrawal(money);
            if(answer == 0)
               System.out.println("Insufficient funds.");
            else
               System.out.println(myAccount1);
         }
         
         if(optionMenu == 3)// create a new PIN number
         {
            System.out.println("Enter your new PIN: ");
            PIN = scan.nextInt();
            myAccount1.setPIN(PIN);
            System.out.println("Your PIN has been set.");
         }
         
         if(optionMenu == 4)// show the balance
         {
            System.out.println("The balance on the account is " + balance);
         }
         scan.nextLine();
         System.out.println("Do you want to continue? Choose yes or no.");
         keepGoing = scan.nextLine();
      }// end while loop
      System.out.println("Thank you for choosing Chase!");
   }// end main
}// end class