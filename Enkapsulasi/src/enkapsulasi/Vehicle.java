/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author MSI TRIDENT
 */
public class Vehicle {
    private double load;
    private double maxLoad;

    public Vehicle(double maxLoad) {
        this.maxLoad = maxLoad;
        
    }
    
    public double getLoad(){
        return this.load;
    }
    
    public double getMaxLoad(){
        return this.maxLoad;
    }
    
    public boolean addBox(double weight){
        
        boolean check = false;
        if(weight + load > maxLoad){
            check= false;
        }else if(weight + load <= maxLoad){
            load += weight;
            check=  true;
        }
        return check;
        
    }
    
}
