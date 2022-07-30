package entities;

public class People {
    private double height;
    private String genre;

    public People() {
    }

    public People(double height, String genre) {
        this.height = height;
        this.genre = genre;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
