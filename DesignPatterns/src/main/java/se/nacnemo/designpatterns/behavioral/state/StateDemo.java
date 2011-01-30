package se.nacnemo.designpatterns.behavioral.state;

public class StateDemo {

    public static void main(String[] args) {
        GameContext sc = new GameContext();
        sc.runEngine();

        sc.runEngine();
        sc.runEngine();
        sc.runEngine();
        sc.runEngine();
    }
}
