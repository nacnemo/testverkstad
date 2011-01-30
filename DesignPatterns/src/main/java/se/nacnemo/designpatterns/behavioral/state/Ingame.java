/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nacnemo.designpatterns.behavioral.state;

/**
 *
 * @author apo
 */
public class Ingame implements State {

    @Override
    public void runEngine(GameContext wrapper) {
        System.out.println("In ingamestate, changing to..");
        wrapper.setState(new End());
    }
}
