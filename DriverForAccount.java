// Martin Ljuljduraj  
// driver for Account

import java.util.Scanner;

public class DriverForAccount
{
   public static void main(String[] args)
   {
      // declare var
      String name;
      long acctNum;
      double balance, money;
      int PIN;
      
      // instantiate Scanner object
      Scanner scan = new Scanner(System.in);
      
      // get user input
      System.out.println("Enter your name: ");
      name = scan.nextLine();
      
      Account myAccount2 = new Account(name);
      System.out.println(myAccount2);
      
      System.out.println("How much will you deposit to open your account?");
      balance = scan.nextDouble();
      
      Account myAccount3 = new Account(name, balance);
      System.out.println(myAccount3);
      
      //System.out.println("You will get an initial PIN, which you can change.");
      
      // instantiate an Account object
      //Account myAccount1 = new Account(name, 123456789, 1234, balance);
      
      // report on the status of the account
      //System.out.println(myAccount1);
      
      /*
      
      // deposit
      System.out.println("How much do you want to deposit? ");
      money = scan.nextDouble();
      myAccount1.deposit(money);// method call
      System.out.println(myAccount1);// report :: receipt
      
      // withdrawal
      System.out.println("How much do you want to withdraw? ");
      money = scan.nextDouble();
      int answer = myAccount1.withdrawal(money);
      if(answer == 0)
         System.out.println("Insufficient funds.");
      else
         System.out.println(myAccount1);
         
      // balance
      
      // change PIN
      System.out.println("Enter your new PIN: ");
      PIN = scan.nextInt();
      myAccount1.setPIN(PIN);
      System.out.println("Your PIN has been set.");
      
      */
   }// end main
}// end class
      