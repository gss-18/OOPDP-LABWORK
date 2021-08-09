/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK03;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass3q2 {
    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' for matrix row and coloumn: ");
        int n=sc.nextInt();
        int[][] a= new int[n][n];
            System.out.print("Enter the elements of matrix: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(a[i][j]>max){
                        max=a[i][j]; 
                    }
                }
                 
            }
           System.out.println(" The maximum value is "+max);
            
    }
}
