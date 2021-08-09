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
public class Ass6q4 {
    static double hours;
    static double rate;
    static String name;
    Ass6q4(String name,double hours,double rate){
        Ass6q4.name=name;
        Ass6q4.hours=hours;
        Ass6q4.rate=rate;
    }
      void Calculation()
	{
		double grossPay;
		if (hours <= 40)
		{
			grossPay = hours * rate;
		}
		else 
		{
			
			double HalfTime = hours / 2;
			grossPay = (hours + HalfTime) * rate;
		}
	System.out.print("\nName of the employee is: "+name);
        System.out.print("\nWorking hours: "+hours);
        System.out.print("\nGross pay is: "+rate);
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter name of 1st emp: ");
        String name=sc.next();
        System.out.print("Enter working hours: ");
        int hrs=sc.nextInt();
        System.out.print("Enter hourly rate: ");
        int rate=sc.nextInt();
        Ass6q4 emp1=new Ass6q4(name,hrs,rate);
        emp1.Calculation();
        
        
        System.out.print("\nEnter name of 2nd emp: ");
        String name2=sc.next();
        System.out.print("Enter working hours: ");
        int hrs2=sc.nextInt();
        System.out.print("Enter hourly rate: ");
        int rate2=sc.nextInt();
        Ass6q4 emp2=new Ass6q4(name2,hrs2,rate2);
        emp2.Calculation();
        
        System.out.print("\nEnter name of 3rd emp: ");
        String name3=sc.next();
        System.out.print("Enter working hours: ");
        int hrs3=sc.nextInt();
        System.out.print("Enter hourly rate: ");
        int rate3=sc.nextInt();
       
        Ass6q4 emp3=new Ass6q4(name3,hrs3,rate3);
        emp3.Calculation();
    }
    
}
