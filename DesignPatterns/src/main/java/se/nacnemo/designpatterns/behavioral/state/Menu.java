/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nacnemo.designpatterns.behavioral.state;

/**
 *
 * @author apo
 */
public class Menu implements State {

    @Override
    public void runEngine(GameContext wrapper) {
        System.out.println("In Menustate, changing to..");
        wrapper.setState(new Ingame());
    }
}
