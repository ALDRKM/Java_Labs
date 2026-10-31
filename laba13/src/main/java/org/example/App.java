package org.example;
import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try{
        List<Musician> music = new ArrayList<>(List.of(
                new Musician("madk1d","гитара","rap",new ArrayList<String>(List.of("1мая","цены")),8),
                new Musician("NoizeMC","барабаны","rock",new ArrayList<String>(List.of("Машины","Вселенная")),10),
                new Musician("Серега Пират","эквалайзер","rap",new ArrayList<String>(List.of("Апельсин","ЧСВ")),7)));
        for(Musician m : music){
            System.out.println(m);
        }
        for(Musician m : music){
            m.releaseAlbum("Пекник на заправке");
        }
        for(Musician m : music){
            System.out.println(m);
        }}
        catch(InvalidMusicianDataException e){
            System.out.println(e.getMessage());
        }
        catch(MusicianNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(AlbumException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("А вот теперь можно и finally вызвать");
        }
    }
}
