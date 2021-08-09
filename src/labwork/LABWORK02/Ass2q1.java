package labwork.LABWORK02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gsstr
 */
public class Ass2q1 {
   	public static void main(String[] args) {

		int a = 0, b = 1, c=0;
		int N = 89; // <-- Upto N
		
		System.out.println("Fibonacci upto series upto "+ N +" is: ");
		
		System.out.print(a+" ");
		
		while(c != N) {
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
 		
	}

}
    

