/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK06;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass6q3 {
    
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0||i==n||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
       }        
    }
}
