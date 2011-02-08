package se.nacnemo.designpatterns.behavioral.strategy.behavior.fight;

public class Strike implements FightBehavior {

    @Override
    public void fight() {
        System.out.println("all i know is jabs! and I've got a good reach!");
    }
}
