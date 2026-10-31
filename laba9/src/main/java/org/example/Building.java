package org.example;

public abstract class Building {
    private String adress;
    private int floors;
    private double area;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Building(){}
    public Building(String adress, int floors, double area){
        this.adress = adress;
        this.floors = floors;
        this.area = area;
    }

    public abstract String getPurpose();
    public abstract int calculateCopacity();

    public static void show(Building[] mas){
        for(int i = 0;i< mas.length; i++){
            System.out.printf("%-15s | %10d\n",mas[i].getPurpose(),mas[i].calculateCopacity());
        }
    }
}
