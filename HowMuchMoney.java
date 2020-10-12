//By: Yash Patel
//Purpose: To create a program that allows us to convert coins entered to a total dollar amount and total number of coins.

import java.util.Scanner ;

public class HowMuchMoney
{
   public static void main (String []args)
      {
         int pennies = 0 ;
         int nickels = 0 ;
         int dimes = 0 ;
         int quarters = 0 ;
         
         Scanner input= new Scanner(System.in);
         
         System.out.println("This program will let you know how many coins "
         + "you have and their total value.");
         System.out.println("Please enter the amount of pennies you have and hit enter: ");
         pennies = input.nextInt();
         
         System.out.println("Please enter the amount of nickels you have and hit enter: ");
         nickels = input.nextInt();
         
         System.out.println("Please enter the amount of dimes you have and hit enter: ");
         dimes = input.nextInt();
         
         System.out.println("Please enter the amount of quarters you have and hit enter: ");
         quarters = input.nextInt();
         
         
         int totalCoins = pennies + nickels + dimes + quarters ;
         double totalAmount = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
         
         System.out.println("You have a total of " + totalCoins + " coins with you.");
         
         System.out.println("You have a total of $" + totalAmount+ " with you.") ;  
      
      }
      
} 
