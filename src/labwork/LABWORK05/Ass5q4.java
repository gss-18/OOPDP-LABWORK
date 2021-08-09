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
public class Ass5q4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks of the student: ");
        int mrks=sc.nextInt();
        int marks=mrks/10;
        switch(marks){
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            case 5:
                System.out.println("Grade E");
                break;
            default:
                System.out.println("Grade f");
                break;
                
        }
    }
    
}
