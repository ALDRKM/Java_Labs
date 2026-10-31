package org.example;

public class MusicianNotFoundException extends RuntimeException{
    public MusicianNotFoundException(String message){
        super(message);
    }
    public MusicianNotFoundException(){
        super("Музыкант не найден");
    }
}
