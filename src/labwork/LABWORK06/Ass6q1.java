/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK06;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author gsstr
 */
public class Ass6q1 {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double x=Math.pow(a, 2);
        double y=Math.pow(b, 2);
        double z=Math.pow(c, 2);
        if(a==0||b==0||c==0){
            System.out.print("Wrong input,Application will exit.");
           System.exit(0);
        }
        else if((x+y)==z||(y+z)==x||(z+x)==y){
          System.out.print("The numbers can represent Right angled traingle.");
        }
        else{
            System.out.print("The numbers can't represnt Right angled traingle.");
        }
    }
    
}
