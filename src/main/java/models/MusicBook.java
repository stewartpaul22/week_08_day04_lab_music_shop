package models;

import behaviours.ISell;

public class MusicBook implements ISell {

    private String title;
    private int buyPrice;
    private int sellPrice;

    public MusicBook(String title, int buyPrice, int sellPrice) {
        this.title = title;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getTitle() {
        return this.title;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

}
