// Martin Ljuljduraj
// Account class

import java.text.NumberFormat;
import java.util.Random;

public class Account
{
   // data
   private String name;
   private long accountNumber;
   private int PIN;
   private double balance;
   
   // instantiate NumberFormat object
   NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
   
   // instantiate Random object
   Random rand = new Random();
   
   // Constructor
   public Account(String name, long accountNumber, int PIN, double balance)
   {
      this.name = name;
      this.accountNumber = accountNumber;
      this.PIN = PIN;
      this.balance = balance;
   }// end constructor
   
   // method overloading
   public Account(String name, double balance)
   {
      this.name = name;
      this.balance = balance;
      accountNumber = rand.nextLong();
      PIN = 2345;
   }
   
   // method overloading - again
   public Account(String name)
   {
      this.name = name;
      balance = 0.0;
      accountNumber = rand.nextLong();
      PIN = 4567;
   }
   
   // reporter
   public String toString()
   {
      String result;
      result = "Account Holder's Name: " + name + "\n";
      result += "Account Number: " + accountNumber + "\n";
      result += "PIN = " + PIN + "\n";
      result += "Balance = " + fmt.format(balance);
      return result;
   }
   
   // getBalance() method
   public String getBalance()
   {
      return fmt.format(balance);
   }
   
   // setPIN method
   public void setPIN(int PIN)
   {
      this.PIN = PIN;
   }
   
   // deposit method
   public void deposit(double money)
   {
      if(money >= 0)
         balance += money;
   }
   
   // withdrawal method
   public int withdrawal(double money)
   {
      if((balance - money) < 0)
         return 0;
      else
      {
         balance -= money;
         return 1;
      }
   }
}// end class Account
         
   