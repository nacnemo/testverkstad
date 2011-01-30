package se.nacnemo.designpatterns.behavioral.visitor;

interface Element {

    public void accept(Visitor visitor);
}
