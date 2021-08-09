/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LabTest;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Account {
    static int accountno,balance;
    static int initial=5000;
    String accname,address,type;
    Account(String n,int no,int b) { 
        accname=n; 
        accountno=no; 
        balance=b; 
    }
    Account(String n,int no,String addr,String t,int b)
    {
    accname=n; 
    accountno=no;
    address=addr;
    type=t; 
    balance=b;
}
    
    static int deposit(int a){
         balance=initial+a;
         return balance;
    }
    static int withdraw(int a){
         balance=initial-a;
        return balance;
    }
    static int getbalance(){
        return balance;
    }
    void show(){
        System.out.print("Account Details");
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Account name: ");
        String name=sc.next();
        System.out.println("Enter your Account number: ");
        String no=sc.next();
        System.out.println("Enter your address: ");
        String addr=sc.next();
        System.out.println("Type of Account?: ");
        String tp=sc.next();
        System.out.print("Enter (0)deposit or (1)withdraw: ");
       
        int dec=sc.nextInt();
        if(dec==0){
            System.out.print("Enter the amount to be deposited: ");
            int dep=sc.nextInt();
            deposit(dep);
        }
        else{
            System.out.print("Enter the amount to be withdrawn: ");
            int with=sc.nextInt();
            withdraw(with);
        }
        System.out.println("\n ACCOUNT DETAILS");
        System.out.println("------------------------");
        System.out.println("Name : "+ name);
        System.out.println("Number : "+no);
        System.out.println("Address: "+ addr);
        System.out.println("Type : "+ tp);
        System.out.println("Balance : "+ getbalance());
    }
    
}
