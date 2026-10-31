package org.example;


import java.util.ArrayList;
import java.util.List;


public class Musician {
    private String name;
    private String instrument;
    private String genre;
    private List<String> alboms;
    private double rating;

    public Musician(){}

    public Musician(String name, String instrument, String genre,List<String> alboms, double rating){
        if(alboms.size()<0){
            throw new InvalidMusicianDataException("У музыканта не может быть отрицательное количество альбомов");
        }
        if(rating >10 || rating<1){
            throw new InvalidMusicianDataException("Рейтинг должен быть от 1 до 10");
        }
        this.name=name;
        this.instrument=instrument;
        this.genre=genre;
        this.alboms = new ArrayList<>(alboms);
        this.rating = rating;
    }

    public void releaseAlbum(String title){
        if(title.isEmpty() || title == null){
            throw new AlbumException();
        }
        this.alboms.add(title);

        System.out.println("Альбом: "+title+" выпущен.");
    }
    public void updateRating(double rating){
        this.rating=rating;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "name='" + name + '\'' +
                ", instrument='" + instrument + '\'' +
                ", genre='" + genre + '\'' +
                ", alboms=" + alboms +
                ", rating=" + rating +
                '}';
    }
}
