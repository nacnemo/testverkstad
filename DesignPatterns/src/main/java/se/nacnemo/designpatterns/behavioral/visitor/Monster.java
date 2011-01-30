package se.nacnemo.designpatterns.behavioral.visitor;

public class Monster extends Organism implements Element {

    public void move() {
        System.out.println("In monster move method");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
