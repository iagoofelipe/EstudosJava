package dev.iagocarvalho.screenmatch.models;

import dev.iagocarvalho.screenmatch.calculation.IClassifiable;

public class Movie extends Title implements IClassifiable {

    public Movie(String name, int releaseYear, int durationMinutes) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.durationMinutes = durationMinutes;
    }

    @Override
    public int getClassification() {
        return (int) getRatingAverage() / 2;
    }
}
