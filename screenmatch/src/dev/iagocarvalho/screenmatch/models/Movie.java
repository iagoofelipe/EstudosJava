package dev.iagocarvalho.screenmatch.models;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean inPlan;
    private double sumRatings;
    private int numRatings;
    private int durationInMinutes;

    public Movie(String name, int releaseYear, boolean inPlan, int durationInMinutes) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.inPlan = inPlan;
        this.durationInMinutes = durationInMinutes;
    }

    public void showDetails() {
        System.out.printf("Movie %s with %.2f of rating evaluated by %d users", this.name, this.getRatingsAverage(), this.numRatings);
    }

    public void rate(double rating) {
        numRatings++;
        sumRatings += rating;
    }

    public double getRatingsAverage() {
        return sumRatings / numRatings;
    }
}
