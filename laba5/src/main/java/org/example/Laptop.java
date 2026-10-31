package org.example;

public class Laptop {
    private String brand;
    private int ram;
    private int storage;
    private int price;

    public Laptop(String _brand, int _ram, int _storage, int _price){
        brand = _brand;
        ram = _ram;
        storage = _storage;
        price = _price;
    }

    public double applyDiscount(int disc){
        return (price-(price*disc/100))/100;
    }

    public double getPrice() {
        return price/100;
    }
    public int getRam(){
        return ram;
    }
    public int getStorage(){
        return storage;
    }
    public String getBrand(){
        return brand;
    }
}
