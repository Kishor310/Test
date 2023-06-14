import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Transfer {
    Scanner sc = new Scanner(System.in);
    ATM b=new ATM();
      public void transfer() {

        try {
            System.out.println("\nEnter recipient's account number: ");
            int accountNumber = sc.nextInt();

            System.out.println("Enter transfer amount");
            double transferAmount = sc.nextDouble();

            if (transferAmount > b.getBal()) {
                System.out.println("\nInsufficient balance. Please try again.\n");
            } else {
                b.transactions++;
                  double newGetBal=b.getBal();
                b.setBalance(newGetBal -= transferAmount);
                System.out.println("\nTransfer amount Successfully.Available balance: " + b.getBal() + "\n");
                String str = transferAmount + " Rs transfered to Account Number: " + accountNumber + "\n";
                b.transactionHistory = b.transactionHistory.concat(str);
            }

        } catch (Exception e) {
            System.out.println("\nInvalid Number.Please try again!");
        }

    }
}