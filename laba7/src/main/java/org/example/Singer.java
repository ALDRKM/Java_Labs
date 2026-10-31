package org.example;

import java.sql.SQLOutput;

public class Singer {
    private String name;
    private String genre;
    private String[] albums;


    public static int totalSingers = 0;
    public static int totalAlboms = 0;
    public static int getAverageAlboms(){
        return totalAlboms/totalSingers;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String[] getAlbums(){
        return albums;
    }
    public void setAlbums(String[] albums){
        this.albums = albums;
    }

    public Singer(String name, String genre, String[] albums){
        this.name = name;
        this.genre = genre;
        this.albums = albums;
        totalSingers++;
        totalAlboms+=albums.length;
    }

    static {
        System.out.println("Был загружен класс Singer");
    }
}
