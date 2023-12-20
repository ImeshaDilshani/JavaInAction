package org.example;

class Vehicle{
    String vehicleName;
    public Vehicle(){
        System.out.println("Vehicle class constructor Invoked");
        vehicleName = "car";
    }
    public Vehicle(String vehicleName){
        System.out.println("Vehicle class parameterized Invoked");
        this.vehicleName = vehicleName;
    }
}

class car extends Vehicle{
    String brand;
    public car(){
        System.out.println("Car class constructor Invoked");
        brand = "BMW";
    }
    public car(String brand){
        System.out.println("Car class parameterized Invoked");
        this.brand = brand;
    }
}
public class ConstructorChainingWithInheritant {

    public static void main(String[] arg){
        car car1 = new car();

        car car2 = new car("Imesha");
    }



}
