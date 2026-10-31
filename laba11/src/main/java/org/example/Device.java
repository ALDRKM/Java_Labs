package org.example;

import java.time.LocalDate;

public abstract class Device {
    private String model;
    private int year;
    private double power;

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getYaer(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public double getPower(){
        return power;
    }
    public void setPower(double power){
        this.power=power;
    }
    public void turnON(){
        System.out.println("Включаю");
    }
    public void turnON(double power){
        System.out.println("Включаю на мощность "+ power);
    }
    public void turnON(String mode){
        System.out.println("Включаю в режиме "+mode);
    }
    public void getEnergyClass(){
        System.out.println("Средний");
    }
    public Device(){}
    public Device(String model, int year, double power){
        this.model=model;
        this.year=year;
        this.power=power;
    }
}
