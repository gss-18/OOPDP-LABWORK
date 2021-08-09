/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK06;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass6q5 {
    static double bbalance;
    static double charges;
    static double credits;
    Ass6q5(double bbalance,double charges,double credits){
        Ass6q5.bbalance=bbalance;
        Ass6q5.charges=charges;
        Ass6q5.credits=credits;
    }
    void calc(){
        double newbal=bbalance+charges-credits;
        if(newbal<credits){
                System.out.print("In the credit limit");
        }
        else
            System.out.print("Credit limit exceeded");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account number: ");
        int a =sc.nextInt();
        System.out.print("Balance at the beginning of month: ");
        double bblance=sc.nextDouble();
        System.out.print("Charges for the month: ");
        double charges=sc.nextDouble();
        System.out.print("Credit for the month: ");
        double credit=sc.nextDouble();
        
        Ass6q5 dep=new Ass6q5(bblance,charges,credit);
        dep.calc();
        
    }
    
}
