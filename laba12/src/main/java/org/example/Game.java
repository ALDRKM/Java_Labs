package org.example;

public abstract class Game {
    private String name;
    private int id;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", rating=" + rating +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Game(String name, int id, double rating) {
        this.name = name;
        this.id = id;
        this.rating = rating;
    }
    public Game(){}
}
