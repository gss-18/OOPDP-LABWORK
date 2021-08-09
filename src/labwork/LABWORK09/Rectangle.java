/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK09;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Rectangle {
    float length,width;
    public Rectangle(){
        this.length=1;
        this.width=1;
    }
    public Rectangle(float length,float width){
        this.setLength(length);
        this.setWidth(width);
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        if(inRange(length)){
            this.length=length;
        }
    }
    public float getWidth(){
        return width;
    }
     public void setWidth(float width){
        if(inRange(width)){
            this.width=width;
        }
    }
     public boolean inRange(float number){
         if(number>0 && number<20){
             return true;
         }
         else 
             System.out.println("Input must be between 1 and 20.");
            
             return false;
     }
     public float perimeter(){
         float peri=2*(this.length+this.width);
         return peri;
     }
     public float area(){
         float ar=this.length*this.width;
         return ar;
     }
     public static void main(String args[]){
         Rectangle re=new Rectangle();
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter length: ");
         float len=sc.nextFloat();
         System.out.print("Enter width: ");
         float bre=sc.nextFloat();
         re.setLength(len);
         re.setWidth(bre);
         System.out.println("The length is: "+re.getLength()+"and the width is: "+re.getWidth());
         System.out.println("The Perimeter is: "+re.perimeter());
         System.out.println("The area is: "+re.area());
         
     }
    
}
