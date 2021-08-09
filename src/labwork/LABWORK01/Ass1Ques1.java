/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK01;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass1Ques1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the character");
        char ch=s.next().charAt(0);
        if((ch>=48)&&(ch<=57)){
            System.out.print("digit");
        }
        else if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.print("Alphabet");
        }
        else{
            System.out.print("Special Character");
        }
    }
    
}
