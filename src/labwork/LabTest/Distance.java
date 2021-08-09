/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LabTest;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Distance {
    void distance(double x1,double x2,double y1,double y2){
        double dis=Math.sqrt((x2-x1)*(x2-x1)-(y2-y1)*(y2-y1));
        System.out.println("Distance between points is: "+dis);
    }
    public static void main(String args[]){
        Distance dis=new Distance();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X1: ");
        int x1=sc.nextInt();
        System.out.println("Enter X2: ");
        int x2=sc.nextInt();
        System.out.println("Enter Y1: ");
        int Y1=sc.nextInt();
        System.out.println("Enter Y2: ");
        int Y2=sc.nextInt();
        dis.distance(x1, x2, Y1, Y2);
    }
    
}
