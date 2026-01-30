package dev.iagocarvalho.screenmatch.calculation;

import dev.iagocarvalho.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;
    private int numTitles = 0;

    public int getTotalTime() {
        return totalTime;
    }

    public int getNumTitles() {
        return numTitles;
    }

    public void add(Title title) {
        totalTime += title.getDurationMinutes();
        numTitles++;
    }

    public void showDetails() {
        System.out.println("Total " + totalTime + " minutes with " + numTitles + " titles");
    }
}
