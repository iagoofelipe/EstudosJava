package dev.iagocarvalho.screenmatch.models;

public class Series extends Title {
    private int numSeasons;
    private boolean active;
    private int numEpisodesBySeason;
    private int minutesByEpisode;

    public int getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(int numSeasons) {
        this.numSeasons = numSeasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getNumEpisodesBySeason() {
        return numEpisodesBySeason;
    }

    public void setNumEpisodesBySeason(int numEpisodesBySeason) {
        this.numEpisodesBySeason = numEpisodesBySeason;
    }

    public int getMinutesByEpisode() {
        return minutesByEpisode;
    }

    public void setMinutesByEpisode(int minutesByEpisode) {
        this.minutesByEpisode = minutesByEpisode;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.printf("Seasons: %d\nIs Active: %s\n", numSeasons, active);
    }
}
