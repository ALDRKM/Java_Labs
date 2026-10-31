package org.example;

import java.time.LocalDateTime;

public class Ship implements Transportable , Maintainable
{
    private String brand;
    private int capacity;
    private  double tonnage;
    private LocalDateTime servicedate;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public void setServiceDate(LocalDateTime servicedate) {
        this.servicedate = servicedate;
    }

    @Override
    public LocalDateTime getServiceDate(){
        return servicedate;
    }
    @Override
    public int getCapacity(){
        return capacity;
    }
    @Override
    public void transport(){
        System.out.println("Корабль бренда "+brand+" превозит груз!");
    }
    @Override
    public void maintain(){
        System.out.println("Крабль на тех-обслуживании");
    }

    public Ship(){}
    public Ship(int capacity, String brand, double tonnage, LocalDateTime servicedate){
        this.capacity = capacity;
        this.brand = brand;
        this.tonnage = tonnage;
        this.servicedate = servicedate;
    }
}
