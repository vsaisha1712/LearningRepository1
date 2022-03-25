import java.util.Scanner;
import java.util.*;
public class ABC {
    public static void displayTotal(customer[] arr,int n){
        int total_balance = 0;
        for(int i=0;i<n;i++){
        total_balance += arr[i].balance;
        }
        System.out.println("Total Amount in Bank ABC is : "+ total_balance);
    }
    public static void main(String args[]) {
        customer[] arr;
        System.out.print("Enter Number of customers in Bank ABC : ");
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        arr = new customer[n];   
        for(int i=0;i<n;i++){
            System.out.print("Enter customer details(name,account.no.,account type,balace): ");
            arr[i] = new customer();
            String name;
            name = sc.next();
            String account_no;
            account_no = sc.next();
            String account_type;
            account_type = sc.next();
            int balance;
            balance = sc.nextInt();
            arr[i].fillData(name,account_no,account_type,balance);
        }
        System.out.println("\nCustomer Details : \n");
        for(int i=0;i<n;i++){
        System.out.println("Details of customer: ");
        arr[i].displayData();
        }
        displayTotal(arr,n);
    }
}
class customer{   
    String name;
    String account_no;
    String account_type;
    int balance; 
    public void fillData(String name,String account_no,String account_type,int balance)
    {
        this.name = name;
        this.account_no = account_no;
        this.account_type = account_type;
        this.balance = balance;
    }   
    public void displayData()
    {
        System.out.println("Name : "+name+" ; Account Number: "+account_no);
        System.out.println("Account Type: "+account_type+" ; Balance: "+balance);
        System.out.println("");
    }  
}
