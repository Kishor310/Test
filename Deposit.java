import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Deposit{
     Scanner sc = new Scanner(System.in);
    ATM b=new ATM();

    
     public void deposit() {
        try {
            System.out.println("\nEnter the amount that you want to deposit: ");
            double depositAmount = sc.nextDouble();

            b.transactions++;
            double newGetBal=b.getBal();
            newGetBal+= depositAmount;
            b.setBalance(newGetBal); 
            System.out.println("\nDeposit Successfully.Available balance: " +newGetBal + "\n");

            String str = depositAmount + " Rs Deposited\n";
            b.transactionHistory = b.transactionHistory.concat(str);
            b.balance=newGetBal;

        } catch (Exception e) {
            System.out.println("\nInvalid Number.Please try again!");
        }

    }
     
}