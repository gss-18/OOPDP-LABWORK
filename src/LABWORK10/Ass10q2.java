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
public class Ass10q2 {
    public static void main(String agrs[]){
        int flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter number of colums: ");
        int cols=sc.nextInt();
        
        int mat[][]=new int[row][cols];
        int trans[][]=new int[row][cols];
        System.out.println("Enter elements of matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the matrix:") ;
         for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                 System.out.print(mat[i][j]+"\t");
            }
             System.out.println("");
        }
          for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                trans[j][i]=mat[i][j];
            }
        }
         if(row==cols){
            for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]!=trans[i][j]){
                    flag=0;
                    break;
                }
            }
        }
         }
       
         if(flag==1){
             System.out.println("The matrix is Symmetric");
         }
         else{
             System.out.println("The matrix is not Symmetric");
         }
    }
}
