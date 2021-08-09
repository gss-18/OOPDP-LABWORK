/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK07;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author gsstr
 */
public class Ass7q4 {
    public static boolean flip(){
        int random=(int) (Math.random()*2);
        boolean result=false;
        if(random==0){
            result=true; //head
        }
            return result;
    }
    public static void main(String args[]){
        int input=0;int heads=0;int tails=0;
        Scanner sc=new Scanner(System.in);
        while(input!=-1){
        System.out.println("\nEnter the number of times to toss or Enter -1 to exit: ");
        input=sc.nextInt();
        System.out.println();
        for(int i=0;i<input;i++){
            if(flip()){
                heads++;
            }
            else{
                tails++;
            }
        }
         if(input>0){
            System.out.print("Number of times heads: "+heads+ "and tails is: "+ tails);
            
        }
    }
        if(input==-1){
            System.exit(0);
        }
    }
    
}
