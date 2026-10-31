package org.example;

public class ResidentialBuilding extends Building{
    private int apartments;
    public int getApartments(){
        return apartments;
    }
    public void setApartments(int apartments){
        this.apartments = apartments;
    }
    @Override
    public String getPurpose(){
         return "Жилой дом";
    }
    @Override
    public int calculateCopacity(){
        return apartments * 3;
    }
    public ResidentialBuilding(String adress, int foors, double area, int apartments){
        super(adress,foors,area);
        this.apartments = apartments;
    }
}
