package se.nacnemo.designpatterns.behavioral.state;

public class StateDemo {

    public static void main(String[] args) {
        GameContext context = new GameContext();
        context.runEngine();

        context.runEngine();
        context.runEngine();
        context.runEngine();
        context.runEngine();
    }
}
