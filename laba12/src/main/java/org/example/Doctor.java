package org.example;
import java.util.List;

public class Doctor {
    private int id;
    private String name;
    private String spetianlization;
    private double rating;
    private List<Integer> patientratings;

    public Doctor(){}

    public Doctor(int id, String name, String spetianlization, double rating, List<Integer> patientratings) {
        this.id = id;
        this.name = name;
        this.spetianlization = spetianlization;
        this.rating = rating;
        this.patientratings = patientratings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpetianlization() {
        return spetianlization;
    }

    public void setSpetianlization(String spetianlization) {
        this.spetianlization = spetianlization;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Integer> getPatientratings() {
        return patientratings;
    }

    public void setPatientratings(List<Integer> patientratings) {
        this.patientratings = patientratings;
    }

    public double getAverageRating(){
        if(patientratings.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(Integer i : patientratings){
            sum += i;
        }
        return sum/patientratings.size();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", spetianlization='" + spetianlization + '\'' +
                ", rating=" + rating +
                ", averagerating= " + getAverageRating() +
                '}';
    }

    public static void printDoctors(List<Doctor> list, double rating){
        for(Doctor d : list){
            if(d.getRating()>=rating){
                System.out.println(d);
            }
        }
    }
}
