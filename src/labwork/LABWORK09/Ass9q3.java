/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.LABWORK09;

/**
 *
 * @author gsstr
 */
public class Ass9q3 {
     public enum TrafficLight {  
        RED(1),  
        GREEN(2),  
        YELLOW(3);

        private final int duration; 

        TrafficLight(int duration) { 
            this.duration = duration; 
        }  

        public int getDuration() { 
            return this.duration; 
        } 


        public static void main(String[] args) 
        {
            for(TrafficLight light: TrafficLight.values())
            {
               System.out.println("The traffic light value is: " +light);
               System.out.println("The duration of that trafic light value is: " + light.getDuration());
            }
        }   
    }

}
