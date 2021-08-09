/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK09;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass9q1 {
    public static double fib(double n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n for the series: ");
        double n=sc.nextDouble();
        System.out.print("Nth fibonacci series is: "+fib(n));
    }
    
    
}
