
package com.mycompany.java.objectoreinted.Bank;

public class Bank {
    String accountNumber;
    String ownerName;
    double balance;
    
    Bank(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    Bank(){
        System.out.println("AccountName: " + accountNumber);
        System.out.println("OwnerName: " + ownerName);
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount){
        this.balance = balance + amount;      
        System.out.println("Deposit: "+amount);
    }
    public void withdraw(double amount){
        this.balance = balance - amount;      
        System.out.println("Withdraw: "+amount);
    }
    public void ShowBalance(){
        System.out.println("------------------------");
        System.out.println("AccountName: "+this.accountNumber);
        System.out.println("OwnerName: "+this.ownerName);
        System.out.println("Balance: "+this.balance);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Bank B = new Bank("00225", "KrungThai", 1000.f);
        B.ShowBalance();
        B.deposit(100);
        B.ShowBalance();
        B.withdraw(200);
        B.ShowBalance();
    }
}
