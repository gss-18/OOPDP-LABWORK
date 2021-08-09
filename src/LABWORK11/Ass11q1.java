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
public class Ass11q1 {
    public static String reverse(String s){
        int i=s.length()-1;
        String ans="";
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')i--;
            int j=i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' ')i--;
            if(ans.isEmpty()){
                ans=ans.concat(s.substring(i+1, j+1));
            }
            else{
                ans=ans.concat(" "+s.substring(i+1, j+1));
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        System.out.print(""+reverse(s)); 
    }
    
}
