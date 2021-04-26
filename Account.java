public class Account{
    private double balance  = 0.0;

    public Account(){
        //default constructor
    }

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amt){
        if(amt>0){
            this.balance += amt;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amt){

        if(this.balance >= amt && amt!=0){
            this.balance = balance - amt;
            return true;
        }
        
        return false;
    }
}