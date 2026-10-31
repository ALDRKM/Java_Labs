package org.example;


public class App 
{
    static{
        System.out.println("Был загружен класс App");
    }
    public static void main( String[] args )
    {
        Singer singer1 = new Singer("Король","Рок",new String[]{"Пирожок","NOSOK"});
        Singer singer2 = new Singer("KSB Music","Рок",new String[]{"KSB4","KSBMUSIC5ЖИЗНЬ"});
        Singer singer3 = new Singer("OliverTree","Поп",new String[]{"OKJJ","JJJ"});
        Singer singer4 = new Singer("Eminem","Рэп",new String[]{"NewAge","Godzilla"});
        Singer singer5 = new Singer("Y2K","Рок",new String[]{"GG","K"});
        System.out.println("Среднее число альбомов на всех исполнителей: "+Singer.getAverageAlboms());
    }
}
