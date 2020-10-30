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
public class Test {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        /*Car c2= new Car("Black","BMW");
        
        c2.setColor("Yellow");
        c2.setModel("Volvo");
        
        
        System.out.println(c2.getColor());
        System.out.println(c2.getModel());*/
        
        Person num1 = new Person("ALI",36, "TAXI DRIVER");
        
        num1.setName("ALI");
        num1.setAge(36);
        num1.setOccupation("TAXI_DRIVER");
        
        System.out.println(num1.getName());
        System.out.println(num1.getAge());
        System.out.println(num1.getOccupation());
        
    }
    
}

      