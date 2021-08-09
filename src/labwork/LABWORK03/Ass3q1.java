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
public class Ass3q1 {
    public static void main(String[] args){
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
            System.out.println("The given array is: ");
            for(int i=0;i<n;i++){
                for(int k=0;k<n;k++){
                 System.out.print(a[i][k]);
                }
            }
         System.out.println("\n The reverse of this array is: ");
            for(int i=1;i>=0;i--){
                for(int k=1;k>=0;k--){
                 System.out.print(a[i][k]); 
                      
            }
            }
    }
    
}
