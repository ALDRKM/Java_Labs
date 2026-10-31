package org.example;

import java.time.LocalDateTime;

public class Truck implements Transportable, Maintainable {
    private int capacity;
    private String brand;
    private LocalDateTime servicedate;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDateTime getServicedate() {
        return servicedate;
    }

    public void setServicedate(LocalDateTime servicedate) {
        this.servicedate = servicedate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void transport() {
        System.out.println("Грузовик бренда " + brand + " перевозит груз");
    }

    @Override
    public void maintain() {
        System.out.println("Грузовик в ремонте");
    }

    @Override
    public LocalDateTime getServiceDate() {
        return servicedate;
    }

    public Truck() {
    }

    public Truck(int capacity, String brand, LocalDateTime servicedate) {
        this.capacity = capacity;
        this.brand = brand;
        this.servicedate = servicedate;
    }

}
