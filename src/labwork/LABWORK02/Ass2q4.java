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
public class Ass2q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int temp=n;
        int rev=0,rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.print("It is palindrome number");
        }
        else{
            System.out.print("It is not a palindrome number");
        }
    }  
}
