/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK05;

import java.util.Scanner;

/**
 *
 * @author gsstr
 */
public class Ass5q5 {
     static int rbinarySearch(int a[],int l,int h,int key){
            int mid=0;
            if(l<=h){
                mid=(l+h)/2;
                if(key==a[mid]){
                    return mid;
                }
                else if(key<a[mid]){
                    return rbinarySearch(a,l,h=mid-1,key);
                }
                else
                    return rbinarySearch(a,h,l=mid+1,key);
            }
            return -1;
        }
    
        public static void main(String[] args){
            
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of elements");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.print("Enter the elements");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.print("Enter the key to be searched");
            int key=sc.nextInt();
            int result=rbinarySearch(a,key,0,n-1);
            if(result==-1){
                System.out.println("Element found");
            }
            else{
                System.out.println("Element not found");
            }
        }
    
}
