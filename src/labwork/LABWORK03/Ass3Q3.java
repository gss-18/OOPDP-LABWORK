/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK03;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass3Q3 {
    static class rectangle{
        double length,width,area;
        String color;
        
        void set_length(double length){
            this.length=length;
        }
        void set_width(double width){
            this.width=width;
        }
        void set_colour(String color){
            this.color=color;
        }
        double find_area(){
            return(this.length*this.width);
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        rectangle a= new rectangle();
        System.out.println("For the first Rectangle: ");
        System.out.println("Enter the length: ");
        a.set_length(sc.nextDouble());
        System.out.println("Enter the width: ");
	a.set_width(sc.nextDouble());
        System.out.println("Enter the colour: ");
        a.set_colour(sc.next());
        System.out.println();
        
        rectangle b= new rectangle();
        System.out.println("For the second Rectangle: ");
        System.out.println("Enter the length: ");
        b.set_length(sc.nextDouble());
        System.out.println("Enter the width: ");
	b.set_width(sc.nextDouble());
        System.out.println("Enter the colour: ");
        b.set_colour(sc.next());
        System.out.println();
        
        if(a.find_area() == b.find_area() && a.color.equals(b.color)) {
	System.out.println("Area: "+a.find_area() + " Color: " + b.color);
        System.out.println("Rectangles Matched !");	
		} 
		else {
			System.out.println("Rectangles Not Matched !");
		}
    }
    
}
