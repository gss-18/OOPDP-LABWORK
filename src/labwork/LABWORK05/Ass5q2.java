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
public class Ass5q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if((a+b)>c||(a+c)>b||(b+c)>a){
          System.out.print("The numbers can represent traingle.");
        }
        else{
            System.out.print("The numbers can't represnt traingle.");
        }
    }
    
}
