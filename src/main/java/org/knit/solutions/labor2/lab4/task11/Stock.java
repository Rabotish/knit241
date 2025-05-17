package org.knit.solutions.labor2.lab4.task11;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final String companyName;
    private double price;
    private final List<StockObserver> observers = new ArrayList<>();

    public Stock(String companyName, double price) {
        this.companyName = companyName;
        this.price = price;
    }

    public void subscribe(StockObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(StockObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            double oldPrice = this.price;
            this.price = newPrice;
            notifyObservers(oldPrice, newPrice);
        }
    }

    private void notifyObservers(double oldPrice, double newPrice) {
        for (StockObserver observer : observers) {
            observer.update(this, oldPrice, newPrice);
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getPrice() {
        return price;
    }
}
