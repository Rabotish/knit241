package org.knit.solutions.labor2.lab4.task12;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history = new Stack<>();

    // Сохраняем состояние редактора
    public void save(TextEditor editor) {
        history.push(editor.saveState());
    }

    // Откат к предыдущему состоянию
    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            Memento memento = history.pop();
            editor.restoreState(memento);
        } else {
            System.out.println("Нет сохраненных состояний для отката.");
        }
    }
}
