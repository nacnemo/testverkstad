package se.nacnemo.designpatterns.behavioral.strategy.behavior.speak;

/**
 * Created by IntelliJ IDEA.
 * User: chrisy
 * Date: 1/30/11
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class SarcasticTalk implements SpeakBehavior {

    @Override
    public void speak() {
        System.out.println("My mom hits harder than that!");
    }
}
