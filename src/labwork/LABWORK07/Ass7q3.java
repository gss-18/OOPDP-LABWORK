/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK07;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass7q3 {
    public static int quality_point(int a){
        if(a>=90 && a<=100)
            return 4;
        if(a>=80 && a<=89)
            return 3;
        if(a>=70 && a<=79)
            return 2;
        if(a>=60 && a<=69)
            return 1;
        else
             return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Students average: ");
        int a =sc.nextInt();
        System.out.println("Quality point is: "+ quality_point(a));
    }
   
}
