package org.example;

public class TV extends Device {
    @Override
    public void getEnergyClass(){
        System.out.println("Высокий");
    }
    public TV(){}
    public TV(String model, int year, double power){
        super(model,year,power);
    }
}
