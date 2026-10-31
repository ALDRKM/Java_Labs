package org.example;

public class Tool {
    private String name;
    private double power;
    private double weight;
    public void use(){
        System.out.println("Иснтрумент используется");
    }
    public void displayInfo(){
        System.out.println("Имя: "+name+"\nМощность: "+power+"\nВес: "+weight);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPower(){
        return power;
    }
    public void setPower(double power){
        this.power = power;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public Tool(String name, double power, double weight){
        this.name=name;
        this.power = power;
        this.weight=weight;
    }
}
