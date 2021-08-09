/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK04;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass4q1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter 5 digit number: ");
        int num=sc.nextInt();
        if((num>=10000)&&(num<=99999)){
            System.out.print("   "+(num/10000));
            System.out.print("   "+(num/1000)%10);
            System.out.print("   "+(num/100)%10);
            System.out.print("   "+(num%100)/10);
            System.out.print("   "+(num%10));
        }
        if(num>99999){
            System.out.println("You had entered a number more than five digits.");
        }
        if(num<=9999){
            System.out.println("You had entered a number less than five digits.");
        }
    }
    
}
