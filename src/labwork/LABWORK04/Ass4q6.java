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
public class Ass4q6 {
    static int factorial(int n) {
      int f;
      for(f = 1; n > 1; n--){
         f *= n;
      }
      return f;
   }
   static int ncr(int n,int r) {
      return factorial(n) / ( factorial(n-r) * factorial(r) );
   }
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter n: ");
       int n=sc.nextInt();
       int i,j;
        for(i = 0; i <= n; i++) {
         for(j = 0; j <= n-i; j++){
            System.out.print(" ");
         }
         for(j = 0; j <= i; j++){
            System.out.print(" "+ncr(i, j));
         }
         System.out.println();
      }
   
   }
}   
