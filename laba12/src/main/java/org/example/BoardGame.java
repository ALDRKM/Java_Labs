package org.example;

public class BoardGame extends Game{
    private int players;
    public void setPlayers(int players){
        this.players=players;
    }
    public int getPlayers(){
        return players;
    }

    public BoardGame(String name, int id, double rating, int players) {
        super(name, id, rating);
        this.players = players;
    }

    public BoardGame() {
    }

}
