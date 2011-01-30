package se.nacnemo.designpatterns.behavioral.visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Hero hero) {
        System.out.println("Printing the hero");
    }

    @Override
    public void visit(Monster monster) {
         System.out.println("Printing the monster");
    }

    @Override
    public void visit(Weapon weapon) {
       System.out.println("Printing the weapon");
    }

    @Override
    public void visit(Story story) {
            System.out.println("Printing the story");
    }

}
