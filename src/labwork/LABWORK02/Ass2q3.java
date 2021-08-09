/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK02;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass2q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int nn=n*(n+1)/2;
        System.out.println("Enter the sum of the series is:"+ nn);
    }
    
}
