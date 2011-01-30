package se.nacnemo.designpatterns.behavioral.visitor;

public class DoVisitor implements Visitor {

    @Override
    public void visit(Hero hero) {
        System.out.println("DoVisitor: Move the hero:");
        hero.move();
    }

    @Override
    public void visit(Monster monster) {
        System.out.println("DoVisitor: Move the monster:");
        monster.move();
    }

    @Override
    public void visit(Weapon weapon) {
        System.out.println("DoVisitor: Trigger the weapon");
        weapon.trigger();
    }

    @Override
    public void visit(Story story) {
        System.out.println("DoVisitor: Story");
    }
}
