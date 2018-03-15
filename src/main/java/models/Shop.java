package models;

import behaviours.ISell;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "shops")
public class Shop {

    private int id;
    private String name;
    private ArrayList<ISell> stock;
    private int cash;

    public Shop(String name, int cash) {
        this.name = name;
        this.cash = cash;
        this.stock = new ArrayList<ISell>();
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "shop")
    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    @Column(name = "cash")
    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }
}
