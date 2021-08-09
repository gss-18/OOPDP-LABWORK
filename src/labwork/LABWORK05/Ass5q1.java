/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK05;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass5q1 {
    public static void main(String[] args){
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter in binary number: ");
        String bin=sc.next();
        int decimal=Integer.parseInt(bin,2);
        System.out.println("The decimal equivalent is: "+decimal);
          
    }
    
}
