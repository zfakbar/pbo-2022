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
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creating a vehicle with a 10.000 kg maximum load");
        Vehicle vehicle = new Vehicle(10000);

//        System.out.println("add box #1 500kg");
//        vehicle.load = vehicle.load + 500;
//
//        System.out.println("add box #2 250kg");
//        vehicle.load = vehicle.load + 250;
//
//        System.out.println("add box #3 5000kg");
//        vehicle.load = vehicle.load + 5000;
//
//        System.out.println("add box #4 4000kg");
//        vehicle.load = vehicle.load + 4000;
//
//        System.out.println("add box #5 300kg");
//        vehicle.load = vehicle.load + 300;
//        
//        System.out.println("Vehicle load is "+vehicle.getLoad() +" kg" );
        System.out.println("add box #1 (500kg) : " + vehicle.addBox(500));
        System.out.println("add box #2 (250kg) : " + vehicle.addBox(250));
        System.out.println("add box #3 (5000kg) : " + vehicle.addBox(5000));
        System.out.println("add box #4 (4000kg) : " + vehicle.addBox(4000));
        System.out.println("add box #5 (300kg) : " + vehicle.addBox(300));

        System.out.println("vehicle load is : "+vehicle.getLoad()+" kg");
    }

}
