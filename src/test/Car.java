/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Ali
 */
public class Car {
    
    private String color;
    private String model;
    
   public Car(String color, String model){
       this.color= color;
       this.model= model;
   }
   
   public void setColor(String color) {
       this.color= color;
       
   }
   
   public void setModel(String model) {
       this.model= model;
   }
   
   public String getColor() {
       return color;
   }
   
   public String getModel() {
       return model;
   }
    
   public Car(){
       color="red";
       model="Ferarri";
       System.out.println("The constructor is now running to create car objects");
        
   }
}
