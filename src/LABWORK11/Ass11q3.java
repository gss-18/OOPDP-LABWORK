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
public class Ass11q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String a=sc.next();
        System.out.print("Enter word: ");
        String b=sc.next();
        System.out.print(word(a,b));
        
        
    }
  public static String word(String str, String word) {
  String result = "";
  int i=0;
  int end = 0;
  int l =str.length();
  while( i < str.length()) {
    
    end = i + word.length();
    if( end > l) {
      end=l;
    }
    
    if(str.substring(i,end).equals(word)) {
      
      if(i>0) {
        result = result + str.charAt(i-1);
      }
      
      if(i+word.length() <l) {
        result = result + str.charAt(end);
      }
      
    }
    i++;
  }
  return result;
}
    
    
}
