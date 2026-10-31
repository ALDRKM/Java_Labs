package org.example;

public class App {
    public static void main(String[] args) {
        Building[] mas = {new ResidentialBuilding("Пушкина",21,10,10),
                new ResidentialBuilding("Пушкина",21,10,5),
                new ResidentialBuilding("Пушкина",21,10,15),
                new OfficeBuilding("Короля",5,200,6),
                new OfficeBuilding("Короля",5,200,9)
        };

        Building.show(mas);

    }
}
