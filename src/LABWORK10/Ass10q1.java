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
public class Ass10q1 {
    public static int sgrt(int a[]){
        int temp;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[1];
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
           a[i]=sc.nextInt();
        }
        System.out.print("The second largest number is: "+sgrt(a) );
        
    }
    
}
