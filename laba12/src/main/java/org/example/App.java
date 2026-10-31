package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Map<String,Game> games = new HashMap<>(Map.of("Шахматы",new BoardGame("Шахматы",0,5,2),
                "Манополия",new BoardGame("Манополия",1,5,5),
                "Каркасон",new BoardGame("Каркасон",2,5,4),
                "Покер",new CardGame("Покер",3,5,"Платисковая"),
                "Дурак",new CardGame("Дурак",4,5,"Обычная"),
                "Уно",new CardGame("Уно",5,5,"Обычная"),
                "Doom",new VideoGame("Doom",6,5,"PC"),
                "DarkSouls3",new VideoGame("DarkSouls3",7,5,"Console")));

        for(String name : games.keySet()){
            System.out.print(name+": "+games.get(name)+"\n");
        }
        System.out.println("--------------Второе задание ниже");
        //Второе задание

        List<Doctor> doctorList = new ArrayList<>(List.of(new Doctor(0,"Павел","Мухамор",4.3,new ArrayList<>(List.of(3,4,3,2))),
                new Doctor(1,"Мухамед","Буровик",2,new ArrayList<>(List.of(1,2,3,2))),
                new Doctor(2,"Джамал","Стаматолог",5,new ArrayList<>(List.of(5,4,5,1)))));
        System.out.println("Операция 1 (вывод с рейтингом меньше 3)");
        for(Doctor d : doctorList){
            if(d.getAverageRating()<3){
                System.out.println(d);
            }
        }
        System.out.println("Операция 2 (без вывода, изменение рейтинга)");
        for(Doctor d : doctorList){
            if(d.getAverageRating()>=4){
                d.setRating(d.getRating()+1);
            }
        }
        System.out.println("Операция 3 (через статический метод)");
        Doctor.printDoctors(doctorList,3);
        System.out.println("Операция 4 (сортировка и вывод)");
        doctorList.sort(Comparator.comparing(Doctor::getAverageRating).reversed().thenComparing(Doctor::getName));
        for(Doctor d: doctorList){
            System.out.println("ID: "+d.getId()+" имя: "+d.getName()+" средний рейтинг: "+d.getAverageRating());
        }
    }
}
