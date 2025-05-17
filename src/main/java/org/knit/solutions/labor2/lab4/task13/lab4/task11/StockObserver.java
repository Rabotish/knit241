package org.knit.solutions.labor2.lab4.task13.lab4.task11;

public interface StockObserver {
    void update(Stock stock, double oldPrice, double newPrice);
}
