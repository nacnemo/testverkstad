package se.nacnemo.designpatterns.behavioral.visitor;

public class Hero extends Organism implements Element {

    public void move() {
       System.out.println("In hero move method");
    }

    public void accept(Visitor visitor) {
       visitor.visit(this);
    }

}
