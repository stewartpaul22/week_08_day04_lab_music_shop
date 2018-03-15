package models;

import behaviours.IPlay;
import behaviours.ISell;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Instrument implements IPlay, ISell {

    private String colour;
    private String type;
    protected int buyPrice;
    protected int sellPrice;

    public Instrument(String colour, String type, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return this.colour;
    }

    public String getType() {
        return this.type;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

}
