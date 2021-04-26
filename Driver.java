import java.util.*;
public class Driver{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int choice = 0;
        
        Bank bankk = new Bank("Bank of America");
        
        while(choice !=5){

            System.out.println(" <<Menu>>\n[1] Make A New Account \n[2] Bank Info\n[3] Deposit\n[4] Withdraw\n[5] Quit");
            choice = sc.nextInt();

            if (choice == 1){

                System.out.println("Please input your first and last name \nFirst: ");
                String first = sc.next();
                System.out.println("Last: ");
                String last = sc.next();
                System.out.println("Initial Account Balance: ");
                double depo = sc.nextDouble();

                Customer cust = new Customer(first,last);
                Account acc = new Account(depo);
                cust.setAccount(acc);
                bankk.addCustomer(cust);

                System.out.println("Congratulations a new account has been made!");

            }
            
            if (choice == 2){
                System.out.println(bankk.toString());
            }

            if (choice == 3){

                System.out.println("Please input your first and last name \n\nFirst: ");
                String first = sc.next();
                System.out.println("Last: ");
                String last = sc.next();

                Customer cust = bankk.find(first,last);

                if(bankk.getNumOfCustomers() == 0 || cust == null){
                    System.out.println("Customer does not exist!");
                }

                else{
                    System.out.println("Please enter the amount to deposit: ");
                    double depo = sc.nextDouble();
                    if(cust.getAccount().deposit(depo)){
                        System.out.println("Deposit successful! Current balance is now: ");
                        System.out.println(cust.getAccount().getBalance());
                    }
                    else{
                        System.out.println("Deposit Failed! Try again with a valid amount later");
                    }
                }
            }

            if (choice == 4){
                
                System.out.println("Please input your first and last name \n\nFirst: ");
                String first = sc.next();
                System.out.println("Last: ");
                String last = sc.next();
                Customer cust = bankk.find(first,last);

                if(bankk.getNumOfCustomers() == 0 || cust == null){
                    System.out.println("Customer does not exist!");
                }
                else{
        
                    System.out.println("Please enter the amount to withdraw: ");
                    double amt = sc.nextDouble();
                    
                    if(cust.getAccount().withdraw(amt)){
                        System.out.println("Withdrawal successful! Current balance is now: ");
                        System.out.println(cust.getAccount().getBalance());
                    }
                    else{
                        System.out.println("Withdrawal Failed! Try again with a valid amount later");
                    }
                }
            }
        }
        
    }
}

    
