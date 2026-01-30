package dev.iagocarvalho.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private double sumRating;
    private int numRatings;
    private int durationMinutes;

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getRatingAverage() {
        return sumRating / numRatings;
    }

    public void rate(double rating) {
        sumRating += rating;
        numRatings++;
    }

    public void showDetails() {
        int min = durationMinutes % 60;
        int hours = durationMinutes / 60;
        System.out.printf("Title: %s\nRelease Year: %d\nRating Average: %.2f\nDuration: %dh %dm\n", name, releaseYear, getRatingAverage(), hours, min);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}
