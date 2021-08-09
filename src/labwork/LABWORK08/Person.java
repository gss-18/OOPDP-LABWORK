/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK08;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Person {
    private String name;
    private String gender;

    public Person(String nm,String gen){
        name=nm;
        gender=gen;
    }
    @Override
    public String toString(){
        return "Person[name=" +name+",gender=" +gender+ "]";
    }
    public static class Teacher extends Person{
        private double salary;
        public Teacher(String nm,String gen,double sal){
            super(nm,gen);
            salary=sal;
        }
        public String toString(){
            return "\nTeacher[details:=" +super.toString()+ ",salary=" +salary+"]";
        }
    }
    public static class Students extends Person{
        private String major;
        public Students(String nm,String gen, String maj){
            super(nm,gen);
            major=maj;
        }
        public String toString(){
            return "\nStudent[Details=" +super.toString()+",major=" +major+ "]";
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("HighSchoolApplication");
        System.out.println("\n=====================");
        System.out.print("\nPerson Details:");
        System.out.print("\nEnter Name: ");
        String name=sc.next();
        System.out.print("\nEnter Gender:");
        String gen=sc.next();
        System.out.println("\n=====================");
        System.out.print("\nStudent Details:");
        System.out.print("\nEnter Students name: ");
        String sname=sc.next();
        System.out.print("\nEnter Gender:");
        String sgen=sc.next();
        System.out.print("\nEnter Major: ");
        String major=sc.next();
        System.out.println("\n=====================");
        System.out.print("\nTeacher Details:");
        System.out.print("\nEnter Teacher's Name: ");
        String tname=sc.next();
        System.out.print("\nEnter Gender:");
        String tg=sc.next();
        System.out.print("\nEnter Salary: ");
        double sal=sc.nextDouble();
        Person p=new Person(name,gen);
        Students s=new Students(sname,sgen,major);
        Teacher t=new Teacher(tname,tg,sal);
        System.out.print(p);
        System.out.print(s);
        System.out.print(t);
    }
}
