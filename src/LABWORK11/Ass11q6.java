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
public class Ass11q6 {
 String name; int reg;
void read()throws  Exception
{
Scanner in= new Scanner(System.in); 
System.out.println("enter the register no : "); 
reg=in.nextInt(); 
System.out.println("enter the name : "); 
name=in.next();

}

void disp()
{
System.out.println("Name :"+name); 

System.out.println("Register No :"+reg); 
 

}
}
class student
{
public static void main(String ar[])
{
int no=0;
Ass11q6 s=new Ass11q6(); 
try
{
Scanner in= new Scanner(System.in); 
System.out.println("Enter the number of students : "); 
no=in.nextInt();
for(int i=0;i<no;i++); 
s.read();
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("the maximum students should be ten\n"); 
no=10;
}
catch(Exception e)
{ System.out.println(e); } 
for(int i=0;i<no;i++);
s.disp();
}
}

    

