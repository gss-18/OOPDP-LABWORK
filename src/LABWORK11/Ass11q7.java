/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABWORK11;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass11q7 {
    public static class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age");
	}
    }
    public static void main(String[] args) throws InvalidAgeException {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter age: ");
                int age=sc.nextInt();
	
		
		if (age < 18 || age >= 60)
			throw new InvalidAgeException();
		
		System.out.println("Name: " + name + " Age: " + age);
	}
}
