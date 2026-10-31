package org.example;

public class InvalidMusicianDataException extends RuntimeException{
    public InvalidMusicianDataException(String message){
        super(message);
    }
    public InvalidMusicianDataException(){
        super("Неверный данные");
    }
}
