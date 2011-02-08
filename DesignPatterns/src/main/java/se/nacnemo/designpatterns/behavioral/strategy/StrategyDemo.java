package se.nacnemo.designpatterns.behavioral.strategy;

import se.nacnemo.designpatterns.behavioral.strategy.behavior.fight.*;
import se.nacnemo.designpatterns.behavioral.strategy.behavior.speak.HumbleTalk;
import se.nacnemo.designpatterns.behavioral.strategy.behavior.speak.SarcasticTalk;
import se.nacnemo.designpatterns.behavioral.strategy.sprite.Fighter;

/**
 *
 *
 */
public class StrategyDemo {

    private static void doActions(Fighter fighter) {
        fighter.performSpeak();
        fighter.performFight();
    }

    public static void main(String[] args) {
        Fighter ninja = new Fighter();
        ninja.setFightBehavior(new Kick());
        ninja.setSpeakBehavior(new SarcasticTalk());
        doActions(ninja);
        ninja.setFightBehavior(new Strike());
        ninja.setSpeakBehavior(new HumbleTalk());
        doActions(ninja);
    }
}
