package org.example;

public class AlbumException extends RuntimeException{
    public AlbumException(){
        super("Ошибка создания альбома");
    }
    public AlbumException(String message){
        super(message);
    }
}
