package org.example;

public class Train {
    private String destination;
    private int trainNumber;
    private int travelTime;

    public Train(String destination, int trainNumber, int travelTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.travelTime = travelTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getTravelTime() {
        return travelTime;
    }
    @Override
    public String toString(){
        return "Направление: "+destination+", номер поезда: "+ trainNumber+", время в пути(часы): "+travelTime;
    }
}
