package org.example;



public class App
{
    public static void main( String[] args )
    {

        Rectangle rect = new Rectangle(15,17);
        System.out.println("Площадь: "+rect.area()+ " периметр: "+ rect.perimeter()+" высота "+rect.getHeight()+" ширена "+rect.getWidth());
        Rectangle rect1 = new Rectangle(25,7);
        System.out.println("Площадь: "+rect1.area()+ " периметр: "+ rect1.perimeter()+" высота "+rect1.getHeight()+" ширена "+rect1.getWidth());

    }
}
