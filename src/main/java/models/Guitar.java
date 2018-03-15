package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "guitars")
public class Guitar extends Instrument  {

    private String model;
    private int numberOfStrings;

    public Guitar(String model, String colour, int numberOfStrings, int costPrice, int retailPrice) {
        super(colour, "String", costPrice, retailPrice);
        this.numberOfStrings = numberOfStrings;
        this.model = model;
    }

    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Column(name = "number_of_strings")
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "Kerrang!!!";
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

}
