package se.nacnemo.designpatterns.behavioral.strategy.behavior.fight;

/**
 * Created by IntelliJ IDEA.
 * User: chrisy
 * Date: 1/30/11
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Kick implements FightBehavior {

    @Override
    public void fight() {
        System.out.println("Several round kicks and a mavashi geri!"
                + "\n Ouch! that's gotto hurt ;)");
    }
}
