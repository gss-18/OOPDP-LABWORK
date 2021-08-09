/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK01;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass1Q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,temp=0;
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        } 
        System.out.println("The elements are: ");
        for(i=0;i<n;i++){
            System.out.print(" " + a[i]);
        }
        System.out.println("");
        for(i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }    
             }
         }
        for(int k=0;k<n;k++){
                 
        }
          System.out.println("The smallest two numbers are: "+a[0]+" and "+a[1]);
          System.out.println("The Highest two numbers are: "+a[n-2]+" and "+a[n-1]);
        }
}
