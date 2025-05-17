package org.knit.solutions.labor2.lab5.task14;

interface Visitor {
    void visit(File file);
    void visit(Folder folder);
    void visit(Link link);
}