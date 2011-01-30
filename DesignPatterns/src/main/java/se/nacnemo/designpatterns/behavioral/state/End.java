/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nacnemo.designpatterns.behavioral.state;

/**
 *
 * @author apo
 */
public class End implements State {

    @Override
    public void runEngine(GameContext wrapper) {
        System.out.println("In endstate, changing to..");
        wrapper.setState(new Intro());
    }
}
