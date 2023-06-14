/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class TransactionHistory {
    
    
    public void transHistory() {
         ATM b=new ATM();
       if (b.transactions == 0) {
           System.out.println("\nNo transactions found");
       } else {
           System.out.println("\nTranscations History:\n\n" + b.transactionHistory);
       }
   }
}