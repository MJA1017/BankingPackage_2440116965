import java.lang.reflect.Array;
import java.util.*;

public class Bank{

    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int numberOfCustomers = customers.size();
    private String bankName = "";

    public Bank(String bName){
        this.bankName = bName;
    }

    public void addCustomer(Customer cust){
        customers.add(cust);
        numberOfCustomers+=1;
    }

    public int getNumOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        System.out.println("Customer at index " + index + "is " + customers.get(index).toString() );
        return customers.get(index);
    }

    public Customer find(String firstname, String lastname){

        for (int i = 0; i < customers.size(); i++){
            if(customers.get(i).getFirstName().equals(firstname) && customers.get(i).getLastName().equals(lastname)){
                return customers.get(i);
            }    
        }
        return null;
    }

    @Override   //annotation
    public String toString() {
        return "Back Name: " + bankName + ", No. of Customers: " + numberOfCustomers;
    }
}

