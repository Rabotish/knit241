package org.knit.solutions.labor2.lab4.task12;

// Класс TextEditor, который представляет редактор текста
public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    public TextEditor(String text) {
        this.text = text;
    }

    // Метод для установки текста
    public void setText(String text) {
        this.text = text;
    }

    // Метод для получения текущего текста
    public String getText() {
        return text;
    }

    // Создание снимка состояния текста
    public Memento saveState() {
        return new Memento(text);
    }

    // Восстановление состояния из снимка
    public void restoreState(Memento memento) {
        this.text = memento.getText();
    }
}
