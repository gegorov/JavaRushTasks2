package com.javarush.task.task14.task1408;

/**
 * Created by gennadi on 23.05.17.
 */
public class MoldovanHen extends Hen{
    private String country;

    public MoldovanHen() {
        this.country = Country.MOLDOVA;

    }

    public String getCountry() {
        return country;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + this.getCountry() + ". Я несу "
                + this.getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}
