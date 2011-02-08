package se.nacnemo.designpatterns.behavioral.strategy.behavior.speak;

public class HumbleTalk implements SpeakBehavior {

    @Override
    public void speak() {
        System.out.println("Your master trained you well. "
                + "\n I have a lot to learn from you. What style"
                + " are you from? ");
    }
}
