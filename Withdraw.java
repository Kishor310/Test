import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Withdraw  {
     Scanner sc = new Scanner(System.in);
  ATM b=new ATM();
     public void withdraw() {

        System.out.println("\nEnter the amount to Withdraw");
        double withdrawAmount = sc.nextDouble();
        try {

            if (withdrawAmount > b.getBal()) {
                System.out.println("\nInsufficient balance.Please try again!");

            } else {
                b.transactions++;
                double newGetBal=b.getBal();
                newGetBal-= withdrawAmount;
                b.setBalance( newGetBal);
                System.out.println("\nAmount Withdrawal Successfully.Available balance: " + newGetBal + "\n");
                String str = withdrawAmount + " Rs Withdrawed\n";
                b.balance=newGetBal;
                b.transactionHistory = b.transactionHistory.concat(str); // Get Transaction history

            }

        } catch (Exception e) {
            System.out.println("\nInvalid Number.Please try again!");

        }
        
    }
}