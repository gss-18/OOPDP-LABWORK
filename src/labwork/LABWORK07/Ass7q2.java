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
public class Ass7q2 {
    public static int quo(int a,int b){
        return a/b;
    }
     public static int rem(int a,int b){
        return a%b;
    }
    public static void displayDigits(int number){
        String results=" ";
        while(number!=0){
            int rem=rem(number,10);
            number=quo(number,10);
            results=rem+" "+results;
        }
        System.out.print(results);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number between 1 and 99999: ");
        int number=sc.nextInt();
        if(number>1 && number<99999){
            displayDigits(number);
        }
        else{
            System.out.print("Wrong Input");
            System.exit(0);
        }
    }
}
