/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK10;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass10q3 {
    public static void printvalue(char digit){
        switch(digit){
            case '0':
                System.out.print("Zero");
                break;
                case '1':
                System.out.print("One");
                break;
                case '2':
                System.out.print("Two");
                break;
                case '3':
                System.out.print("Three");
                break;
                case '4':
                System.out.print("Four");
                break;
                case '5':
                System.out.print("Five");
                break;
                case '6':
                System.out.print("Six");
                break;
                case '7':
                System.out.print("Seven");
                break;
                case '8':
                System.out.print("Eight");
                break;
                case '9':
                System.out.print("Nine");
                break;
                
        }
        
    }
    public static void printword(String n){
        int i,l=n.length();
        for(i=0;i<l;i++){
            printvalue(n.charAt(i));
        }
    }
    
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        String a=sc.next();
        printword(a);
    }
    
}
