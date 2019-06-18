/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedtm;

import java.util.Scanner;

/**
 *
 * @author agyek
 */
public class AutomatedTM {

    public static class BankAccount{
    private String Accountnum;
    private double Balance;
    public BankAccount(String acctNum, double initBal){
        Accountnum = acctNum;
        Balance = initBal;
    }
     public void deposit(double amount){
         double newBalance = Balance + amount;
         Balance = newBalance;
         }
     public boolean withdraw(double amount){
         boolean isSuccess = false;
      if(amount<=Balance){
        isSuccess = true;  
        
        double newBalance = Balance - amount;
         Balance = newBalance;
     }
     return isSuccess;
     }
     public double getBalance(){
        return Balance;
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String accntNum = "20116900";
        double initBal = 100.00;
        
        double amount = 0.00;
        boolean isSuccess = false;
        double balance = 0.00;
        
        BankAccount myAccount;
        myAccount = new BankAccount(accntNum,initBal );
        
        Scanner ms = new Scanner(System.in);
        
        System.out.println("WELCOME TO SAM BANK \n\n");
        System.out.println("Enter 1 to deposit\n");
        System.out.println("Enter 2 to withdraw\n");
        System.out.println("Enter 3 to check balance\n");
        
        int option = ms.nextInt();
        
        switch(option){
            case 1:
                System.out.println("Enter amount to deposit\n");
                amount = ms.nextDouble();
                myAccount.deposit(amount);
                 System.out.println("deposit was successful.\nold balance = GHs "+ initBal + "\nnew balance = GHs "+ myAccount.getBalance());
                return;
                
                case 2:
                System.out.println("Enter amount to withdraw\n");
                amount = ms.nextDouble();
                isSuccess = myAccount.withdraw(amount);
                if(isSuccess == true){
                System.out.println("withdrawal was successful.\nold balance = GHs "+ initBal + "\nnew balance = GHs "+ myAccount.getBalance());

                }else{
                 System.out.println("withdrawal amount exceeds account balance");

                }
                return;
                    
                    case 3:
                System.out.println("your Account balance is GHs " + myAccount.getBalance());
              
                return;
                        
                default:
                System.out.println("invalid input");
              
                return;
                
    }
        
    }
    
}
