package org.example;

public interface Transportable {
    void transport();
    int getCapacity();
    static void show(Transportable[] mas){
        for(int i = 0; i< mas.length; i ++){
            mas[i].transport();
        }
    }
}
