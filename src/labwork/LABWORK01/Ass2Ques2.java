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
public class Ass2Ques2 {
    public static void main(String[] args){
        int a=0,b=0;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        while(num>0){
            a=num%10;
            b=b+a;
            num=num/10;
        }
        System.out.println("The sum is: " +b);
        for(int i=2;i<b;i++){
            if(b%i==0){
            flag=false;
            break;
            }
        }
        if(flag){
            System.out.println("Prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    
}
