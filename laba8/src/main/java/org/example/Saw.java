package org.example;

public class Saw extends Tool{
    private double bladelength;
    public double getBladelength(){
        return bladelength;
    }
    public void setBladelength(double bladelength){
        this.bladelength = bladelength;
    }
    @Override
    public void use(){
        System.out.println("Режет материалы");
    }
    public void sharpenBlade(){
        System.out.println("Лезвие было заточено");
    }
    public Saw(String name, double power, double weight, double bladelength){
        super(name,power,weight);
        this.bladelength = bladelength;
    }
}
