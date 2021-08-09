/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK07;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass7q1 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number: ");
    int a =sc.nextInt();
    double pi=0.0; int odd=1;
    double cterm=0.0;
    for(int i=1;i<=a;i++){
        if(i%2==0){
            cterm=(double)-4/odd;
        }
        else{
            cterm=(double)4/odd;
        }
    odd=odd+2;
    pi=pi+cterm;
    }
    System.out.print(pi);
    }
}