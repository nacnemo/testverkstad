package se.nacnemo.designpatterns.behavioral.visitor;

public class Weapon implements Element {

    public void trigger() {
        System.out.println("BANG! in trigger method");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
