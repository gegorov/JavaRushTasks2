package com.javarush.task.task14.task1408;

/**
 * Created by gennadi on 23.05.17.
 */
public class UkrainianHen extends Hen{
    private String country;

    public UkrainianHen() {
        this.country = Country.UKRAINE;

    }

    public String getCountry() {
        return country;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 17;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + this.getCountry() + ". Я несу "
                + this.getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}
