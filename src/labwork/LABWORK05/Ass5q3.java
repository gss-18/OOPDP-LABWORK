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
public class Ass5q3 {
    
    static void encrypt(int a[]){
        for(int i=0;i<4;i++){
            a[i]=(a[i]+7)%10;
        }
        int temp=a[0];
        a[0]=a[2];
        a[2]=temp;
        
        temp=a[1];
        a[1]=a[3];
        a[3]=temp;
        System.out.print("Encrypted number: ");
        for(int i=0;i<4;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
    static void decrypt(int a[]){
        int temp=a[0];
        a[0]=a[2];
        a[2]=temp;
        
        temp=a[1];
        a[1]=a[3];
        a[3]=temp;
       System.out.print("Decrypted number: ");
       for(int i=0;i<4;i++){
            a[i]=(a[i]+3)%10;
        }
        for(int i=0;i<4;i++){
             System.out.print(a[i]);
        }
         System.out.println();
       }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        System.out.print("Input your message: ");
        int num=sc.nextInt();
        for(int i=3;i>=0;i--) {
        a[i]=num%10;
	num=num/10;
        }
        encrypt(a);
        decrypt(a);
    }
}
