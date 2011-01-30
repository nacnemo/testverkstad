package se.nacnemo.designpatterns.behavioral.visitor;

interface Visitor {

    public void visit(Hero hero);

    public void visit(Monster monster);

    public void visit(Weapon weapon);

    public void visit(Story story);
}
