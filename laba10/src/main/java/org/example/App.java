package org.example;

import java.time.LocalDateTime;
public class App {
    public static void main(String[] args) {

        Transportable[] mas = { new Truck(18,"Ponpushka",LocalDateTime.of(2026,7,7,14,10)),
                new Truck(25,"Pushka",LocalDateTime.of(2026,10,5,17,0)),
                new Truck(15,"Legacy",LocalDateTime.of(2026,8,4,12,0)),
                new Ship(17,"MrBeast",154679.13, LocalDateTime.of(2026,8,2,12,40)),
                new Ship(17,"Lololoshka",154679.13, LocalDateTime.of(2026,8,2,12,40)) };
        Transportable.show(mas);
    }
}
