package org.knit.solutions.labor2.lab5.task14;

// Класс, представляющий ссылку (ярлык)
public class Link implements FileSystemElement {

    private String name;
    private FileSystemElement reference;

    public Link(String name, FileSystemElement reference) {
        this.name = name;
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public FileSystemElement getReference() {
        return reference;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
