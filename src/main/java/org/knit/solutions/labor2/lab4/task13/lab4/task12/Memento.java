package org.knit.solutions.labor2.lab4.task13.lab4.task12;

// Класс Memento, который хранит состояние текста
public class Memento {
    private final String text;

    public Memento(String text) {
        this.text = text;
    }

    // Метод для получения сохранённого состояния
    public String getText() {
        return text;
    }
}
