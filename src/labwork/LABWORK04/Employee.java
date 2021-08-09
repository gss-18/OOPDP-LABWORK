/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK04;

/**
 *
 * @author gsstr
 */
public class Employee {
    String firstname,lastname;
    double monthlysalary;
    Employee(String fname, String lname, double msalary){
        firstname=fname;
        lastname=lname;
        monthlysalary=msalary;
        
        if(msalary<0.0){
            monthlysalary=0.0;
        }
    }
    void set_firstname(String fname){
        firstname=fname;
    }
    String get_firstname(){
        return firstname;
    }
    void  set_lastname(String lname){
        lastname=lname;
    }
    String get_lastname(){
        return lastname;
    }
    void set_monthlysalary(double msalary){
        monthlysalary=msalary;
    }
    double get_monthlysalray(){
        return monthlysalary;
    }
    double getysal(){
        double ysal=monthlysalary*12;
        return ysal;
    }
    double raisesal(){
        double raise=monthlysalary*0.1;
        double raisesal=(monthlysalary+raise)*12;
        return raisesal;
    }
     public static void main(String[] args){
            Employee emp1=new Employee("Gaurang","S",1000);
            Employee emp2=new Employee("Sohan","M",2000);
            System.out.println("\n"+emp1.get_firstname()+" "+emp1.get_lastname()+"'s Yearly salary is: "+ emp1.getysal()+" After 10%raise is: "+emp1.raisesal());
             System.out.println("\n"+emp2.get_firstname()+" "+emp2.get_lastname()+"'s Yearly salary is: "+ emp2.getysal()+" After 10%raise is: "+emp2.raisesal());
            
        }
    
    
    
}
    
    
        
       
    
    

