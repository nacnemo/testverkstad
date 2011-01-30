package se.nacnemo.designpatterns.behavioral.visitor;

public class Story implements Element {

    private Element[] elements;

    public Element[] getElements() {
        return elements.clone();
    }

    public Story() {
        this.elements = new Element[]{new Hero(), new Monster(), new Weapon()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element : this.getElements()) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
