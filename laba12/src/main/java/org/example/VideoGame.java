package org.example;

public class VideoGame extends Game{
    private String platform;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public VideoGame(String name, int id, double rating, String platform) {
        super(name, id, rating);
        this.platform = platform;
    }

    public VideoGame(String platform) {
        this.platform = platform;
    }
}
