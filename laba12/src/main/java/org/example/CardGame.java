package org.example;

public class CardGame extends Game{
    private String dectype;

    public CardGame(String name, int id, double rating, String dectype) {
        super(name, id, rating);
        this.dectype = dectype;
    }

    public CardGame(String dectype) {
        this.dectype = dectype;
    }

    public String getDectype() {
        return dectype;
    }

    public void setDectype(String dectype) {
        this.dectype = dectype;
    }
}
