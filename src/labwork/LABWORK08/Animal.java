/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK08;

/**
 *
 * @author gsstr
 */
public class Animal {
    public void eat(){
        System.out.println("Eat method");
    }
    public void sleep(){
        System.out.println("Sleep method");
    }
}
    class bird extends Animal{
        @Override
        public void eat(){
            super.eat();
            System.out.println("Override Eat method");
        }
        @Override
        public void sleep(){
            super.sleep();
            System.out.println("Override Sleep method");
        }
        public void fly(){
            System.out.println("Fly method");
        }
    public static void main(String args[]){
        Animal a=new Animal();
        bird b=new bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
        
    }    
        
}
    
