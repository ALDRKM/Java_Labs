package org.example;


public class App {
    public static void main(String[] args) {
        Tool[] tools = new Tool[]{new Drill("Чача",23,21,13),
                new Drill("Мираж",13,23,123),
                new Drill("Экстро",32,23,13),
                new Saw("Бабочка",24,13,23),
                new Saw("Бочка",12,44,12)};

        for(int i = 0;i<tools.length;i++){
            tools[i].displayInfo();
            if(tools[i] instanceof Drill drill){
                drill.changeDrillBit();
            }
            else{
                ((Saw)tools[i]).sharpenBlade();
            }
        }
    }
}
