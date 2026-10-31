package org.example;

public class Drill extends Tool{
    private double speed;
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Меня переопределили!");
    }
    @Override
    public void use(){
        System.out.println("Сверлит отверстия");
    }
    public void changeDrillBit(){
        System.out.println("Вы поменяли сверло");
    }
    public Drill(String name, double power, double weight, double speed){
        super(name,power,weight);
        this.speed = speed;
    }
}
