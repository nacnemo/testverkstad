package se.nacnemo.designpatterns.behavioral.state;

/**
 *
 * @author apo
 */
public class GameContext {

    private State currentState;

    public GameContext() {
        setState(new Intro());
    }

    public void setState(State newState) {
        currentState = newState;
    }

    public void runEngine() {
        currentState.runEngine(this);
    }
}
