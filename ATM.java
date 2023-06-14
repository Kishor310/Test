import java.util.Scanner;

 public class ATM {
    
    static Scanner sc=new Scanner(System.in);
  // public double balance;// Initial balance
   double balance=25000.00+this.getBal();
    public String transactionHistory = "";
    public int transactions = 0;
    public void setBalance(double balance)
    {
        balance=this.balance;
       
    }
    public double getBal()
    {
        return balance;
    }
   public void checkBalance() {
     

        System.out.println("\n" + "Available balance is Rs. " + this.balance);
    }

    public static int UserChoice(int limit) {
        // Scanner sc = new Scanner(System.in);
        // User choice for login or Exit function
        int userInput = 0;
        boolean flag = false;

        while (!flag) {
            try {
                
                userInput = sc.nextInt();
                flag = true;

                if (flag && userInput > limit || userInput < 1) {
                    System.out.println("Choose the number between 1 to " + limit);
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("\nEnter only integer value");
                flag = false;
            }
        }

        return userInput;
    }

    public static void main(String[] args) {
        // double balance=0.0;
    ATM a=new ATM();
//       BankAccount b2 = new BankAccount(); // Create instance of BankAccount

        while (true) {
            System.out.println("\n Welcome To ATM System\n-------------------------");
            System.out.println("\n   1.Login \n   2.Exit\n\n-------------------------\n");
            System.out.print("Enter Your Choice : ");
            int choice = UserChoice(2);

            if (choice == 1) {
                if (a.login()) {
                    boolean Quit = false;
                    while (!Quit) {
                        System.out.println(
                                "\n      ATM Menu\n-------------------------\n1.withdraw \n2.Deposit \n3.Transfer  \n4.check balance  \n5.Transaction History \n6.Quit \n-------------------------\n");
                        System.out.print("\nEnter Your Choice : ");
                        // Scanner sc = new Scanner(System.in);
                        int options = sc.nextInt();

                        switch (options) {
                            case 1:
                                Withdraw w=new Withdraw();
                                w.withdraw();
                                break;
                            case 2:
                                Deposit d=new Deposit();
                                d.deposit();
                                break;
                            case 3:
                                Transfer t=new Transfer();
                                t.transfer();
                                break;
                            case 4:
                                ATM b=new ATM();
                                b.checkBalance();
                                break;
                            case 5:
                                TransactionHistory th=new TransactionHistory();
                                th.transHistory();
                                break;
                            case 6:
                                System.out.print("\n       ***\nThank You for using our ATM Service\n Please Visit Again.");
                                Quit = true;
                                // break;
                                System.exit(0);
                            default:
                                System.out.println("\nInvalid Choice.please try again.");
                        }
                    
                    }

                }
            } else {
                System.exit(0);
            }
        }

    }
    
     public boolean login() {

        // User login credentials

        int userid = 31099;
        int userPin = 1410;
        boolean isLogin = false;

        System.out.println("\n-------------------------\n");

        try {

            while (!isLogin) {

                System.out.print("Enter Your Userid :");
                int id = sc.nextInt();
                System.out.print("Enter Your Login Pin :");
                int pin = sc.nextInt();

                if (id == userid && pin == userPin) {
                    System.out.println("\nLogin Sucessfully");
                    isLogin = true;

                } else {
                    System.out.println("\nInvalid userId or Login Pin. Please try again.\n ");
                }
            }

        } catch (Exception e) {
            System.out.println("\nInvalid userId or Login Pin. Please try again.!");

        }
        return isLogin;
    }
    
}