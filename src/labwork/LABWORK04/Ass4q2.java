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
public class Ass4q2 {
    public static void main(String[] args){
        int neg=0,pos=0,zero=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1=sc.nextInt();
    System.out.print("Enter second number: ");
    int num2=sc.nextInt();
    System.out.print("Enter third number: ");
    int num3=sc.nextInt();
    System.out.print("Enter fourth number: ");
    int num4=sc.nextInt();
    System.out.print("Enter fifth number: ");
    int num5=sc.nextInt();
    if(num1<0){
        neg=neg+1;
    }
    if(num2<0){
        neg=neg+1;
    }
    if(num3<0){
        neg=neg+1;
    }
    if(num4<0){
        neg=neg+1;
    }
    if(num5<0){
        neg=neg+1;
    }
    
    if(num1>0){
        pos=pos+1;
    }
    if(num2>0){
        pos=pos+1;
    }
    if(num3>0){
        pos=pos+1;
    }
    if(num4>0){
        pos=pos+1;
    }
    if(num5>0){
        pos=pos+1;
    }
    
    if(num1==0){
        zero=zero+1;
    }
     if(num2==0){
        zero=zero+1;
    }
     if(num3==0){
        zero=zero+1;
    }
     if(num4==0){
        zero=zero+1;
    }
     if(num5==0){
        zero=zero+1;
    }
     System.out.println("");
     System.out.println("Number of negatives: "+neg);
    System.out.println("Number of positives: "+pos);
    System.out.println("Number of zeros: "+zero);
    }
 
    
}
