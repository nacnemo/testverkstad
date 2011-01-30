package se.nacnemo.designpatterns.behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        Story story = new Story();
        story.accept(new DoVisitor());
        story.accept(new PrintVisitor());
    }
}
