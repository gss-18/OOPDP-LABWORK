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
public class Ass7q5 {
    private static int[] arrValues = new int[5];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int remaining = 0;

        while(remaining != 5){
            System.out.println("Enter value 5 between 10 and 100: "+ remaining + 1+":");
            int num = sc.nextInt();

            
            if(num < 10 || num > 100)
                continue;

            
            if(isUnique(num))
                System.out.print("Unique value: \n"+ num);

            try{
               
                arrValues[remaining++] = num;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

            
            printUnique();
        }
    }
    
    public static boolean isUnique(int num){
        for(int i=0; i<arrValues.length; i++){
            if(arrValues[i] == num)
                return false;
        }
        return true;
    }
    
    public static void printUnique(){
        System.out.print("\nUnique values:\n");

      
        System.out.print(arrValues[0] + " ");

       
        int unique = 0;


        for(int i=1; i<arrValues.length; i++){
           
            if(arrValues[i] > 0){
                
                for(int j=i-1; j>=0; j--){
                    if(arrValues[i] == arrValues[j]){
                        unique = 0;
                        break;
                    }else{
                        unique = arrValues[i];
                    }
                }
                if(unique > 0)
                    System.out.print(unique + " ");
            }else{
                continue;
            }
        }
        System.out.println();
    }
    
}
