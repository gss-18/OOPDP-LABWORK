/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK02;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass2q2 {
    public static void main(String[] args){
        double avg=0;int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks of 10 students: ");
        int[] mrks=new int[9];
        for(i=0;i<9;i++){
            mrks[i]=sc.nextInt();
        }
        for(i=0;i<9;i++){
            avg=avg+mrks[i];
            
        }
        System.out.println("The average marks is:" + avg/10);
        double mean=avg/10;
        double nmean=mean;
        System.out.print("The marks that are greater than the mean is: ");
        for(i=0;i<9;i++){
            if(nmean<mrks[i]){
                System.out.print(" "+mrks[i]);
            }
        }
    }
}