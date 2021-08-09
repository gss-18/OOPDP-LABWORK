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
public class Ass4q5 {

    public static void main(String[] args){
        int r,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome number");
        }
        else
            System.out.println("Not palindrome number");
    }
}
