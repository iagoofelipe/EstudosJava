package dev.iagocarvalho.screenmatch.models;

import dev.iagocarvalho.screenmatch.calculation.IClassifiable;

public class Episode implements IClassifiable {
    private int num;
    private String name;
    private Series series;
    private int totalViews;

    public int getNum() {
        return num;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        return totalViews > 100 ? 4 : 2;
    }
}
