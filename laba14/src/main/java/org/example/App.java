package org.example;

import javax.print.DocFlavor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.util.List;
import java.nio.*;

public class App {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите номер задания от 1 до 5(0-выход): ");
        int choice = in.nextInt();
        switch(choice){
            case 0:return;
            case 1: task1(); break;
            case 2: task2(); break;
            case 3: task3(); break;
            case 4: task4(); break;
            case 5: task5(); break;
            default:
                System.out.println("выберите из предложенного диапозона!!!");
                break;
        }
    }

    public static void task1() {
        System.out.println("Задание 1");
        File myartist = new File("MyFavoriteArtist.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(myartist, StandardCharsets.UTF_8))) {
            pw.print("Испольнитель: KSB Music\nЖанр: Рок-Рэп\nНазвание: Ночь");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(myartist))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(myartist.length());
            System.out.println(myartist.getName());
            System.out.println(myartist.getAbsolutePath());
            System.out.println(myartist.canRead());
            System.out.println(myartist.canWrite());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task2() {
        File file = new File("digit.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(file, StandardCharsets.UTF_8))) {
            int n;
            for (int i = 0; i < 10; ) {
                System.out.println("Введите число под номром: " + (i + 1));
                n = in.nextInt();
                if (n > 0) {
                    pw.println(n);
                    i++;
                }
            }
            System.out.println("Данные успешно записаны в файл " + file.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int num;
            int count = 0;
            System.out.println("Чтение из файла");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                num = Integer.parseInt(line.trim());
                if (forTask2(num)) {
                    count++;
                }
            }
            System.out.println("Количество чисел которые являются степенью двойки = " + count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean forTask2(int digit) {
        if (digit < 0)
            return false;
        while (digit % 2 == 0) {
            digit = digit / 2;
        }
        return digit == 1;
    }

    public static void task3() {
        Random random = new Random();
        File f = new File("randomDIGITS.txt");
        File f2 = new File("randomDIGITS2.txt");
        File f3 = new File("randomDIGITS3.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(f, StandardCharsets.UTF_8))) {
            for (int i = 0; i < 10; i++) {
                pw.println(Math.abs(random.nextInt()));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader(f));
                PrintWriter pw2 = new PrintWriter(new FileWriter(f2, StandardCharsets.UTF_8));
             PrintWriter pw3 = new PrintWriter(new FileWriter(f3, StandardCharsets.UTF_8));){

            String line;
            while((line=br.readLine())!=null){
                int n = Integer.parseInt(line.trim());
                int sum = sumdigit(n);
                if(sum%2==0){
                    pw2.println(n);
                }
                else{
                    pw3.println(n);
                }
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static int sumdigit(int n){
        int t,sum=0;
        while(n!=0){
            t=n%10;
            n=n/10;
            sum+=t;
        }
        return sum;
    }
    public static void task4(){
        System.out.println("Введите 10 углов:");
        in.useLocale(Locale.US);
        File file = new File("ugol.txt");
        try(PrintWriter pw = new PrintWriter(new FileWriter(file, StandardCharsets.UTF_8))){
            for(int i = 0; i<10;i++){
            double digit = in.nextDouble();
            if(digit <=0.0){
                return;
            }
            pw.println(digit);
            }
            System.out.println("Файл записан");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader("ugol.txt"))){
            String line;
            double sum=0.0;
            System.out.println("-----------------");
            while((line = br.readLine())!=null){
                sum+=Double.parseDouble(line.trim());
            }
            System.out.println("Средний угол: "+(sum/10));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void task5(){
        File file = new File("last.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(file, StandardCharsets.UTF_8))) {
            int n;
            for (int i = 0; i < 10; i++) {
                System.out.println("Введите число под номром: " + (i + 1));
                n = in.nextInt();
                pw.println(n);
            }
            System.out.println("Данные успешно записаны в файл " + file.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int num;
            int count = 0;
            System.out.println("Чтение из файла");
            while ((line = br.readLine()) != null) {
                num = Integer.parseInt(line.trim());
                if (num<0) {
                    count++;
                }
            }
            System.out.println("Количество чисел которые меньше 0 = " + count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
