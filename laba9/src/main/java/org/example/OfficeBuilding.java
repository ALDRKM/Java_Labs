package org.example;

public class OfficeBuilding extends Building{
    private int companies;
    public int getCopmanies(){
        return companies;
    }
    public void setCopmaniew(int companies){
        this.companies = companies;
    }

    @Override
    public String getPurpose(){
        return "Офисное здание";
    }
    @Override
    public int calculateCopacity(){
        return companies * 10;
    }
    public OfficeBuilding(String adress, int floors, double area, int companies){
        super(adress,floors,area);
        this.companies=companies;
    }
}
