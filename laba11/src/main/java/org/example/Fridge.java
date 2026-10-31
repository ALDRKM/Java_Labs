package org.example;

public class Fridge extends Device{
    @Override
    public void getEnergyClass(){
        System.out.println("Низкий");
    }
    public Fridge(){}
    public Fridge(String model, int year, double power){
        super(model,year,power);
    }
}
