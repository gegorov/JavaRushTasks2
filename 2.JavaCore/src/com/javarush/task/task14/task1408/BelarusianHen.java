package com.javarush.task.task14.task1408;

/**
 * Created by gennadi on 23.05.17.
 */
public class BelarusianHen extends Hen {

    private String country;

    public BelarusianHen() {
        this.country = Country.BELARUS;

    }

    public String getCountry() {
        return country;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + this.getCountry() + ". Я несу "
                + this.getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}
