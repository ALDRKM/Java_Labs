package org.example;


import java.util.List;

public class App {
    public static void main(String[] args) {
        Device[] mas = {new TV("Sumsung", 2020, 156.3), new Fridge("Sumsung", 2000, 45.5)};
        for (int i = 0; i < mas.length; i++) {
            mas[i].turnON();
            mas[i].turnON(mas[i].getPower());
            if (mas[i] instanceof TV)
                mas[i].turnON("Просмотр");
            else
                mas[i].turnON("Жесткая заморозка");
        }
    }
}
