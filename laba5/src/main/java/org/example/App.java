package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете задание:\n1. Скидка для ноутбука\n2. Найти поезд с макс. и мин. временем пути \n3. Все сотрудники из отдела IT");

        while(true){
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    Laptop laptop = new Laptop("",1234,10000,450000);
                    System.out.println("Цена ноутбука без скидки: "+ laptop.getPrice());
                    System.out.println("Введите желаемую скидку для ноутбука:");
                    int discount = in.nextInt();
                    System.out.println("Цена ноутбука со скидкой: "+laptop.applyDiscount(discount));
                    in.nextLine();
                    break;
                case 2:
                    Train[] trains = {new Train("Москва",228,15),new Train("Минск",128,5),
                            new Train("Рига",221,25),new Train("Гомель",228,10)
                            ,new Train("Москва",238,15)};
                    int max = trains[0].getTravelTime();
                    int min = trains[0].getTravelTime();
                    int indexMax = 0;
                    int indexMin = 0;
                    for (int i = 0; i< trains.length; i ++){
                        if(trains[i].getTravelTime()<min){
                            min = trains[i].getTravelTime();
                            indexMin = i;
                        }
                        if(trains[i].getTravelTime()>max){
                            max = trains[i].getTravelTime();
                            indexMax = i;
                        }
                    }
                    System.out.println("Максимальное время в пути: "+trains[indexMax]);
                    System.out.println("Минимальное время в пути: "+trains[indexMin]);
                    break;
                case 3:
                    Worker[] workers = {new Worker("Максим",Department.IT),new Worker("Катя",Department.HR),new Worker("Андрей",Department.MARKETING),
                            new Worker("Максим",Department.SALES),new Worker("Алена",Department.IT),new Worker("Наташа",Department.FINANCE)};
                    for(Worker w : workers){
                        if(w.getDepartment() == Department.IT){
                            System.out.println(w);
                        }
                    }
                    break;
                case 4:
                    in.close();
                    return;
                default:
                System.out.println("Введите номер из предложанных");
                break;
            }
        }
    }
}
