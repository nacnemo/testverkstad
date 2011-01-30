/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nacnemo.designpatterns.behavioral.mediator;

/**
 *
 * @author apo
 */
public class MediatorDemo {

    public static void main(String[] args) {
        RuleMediator mediator = new RuleMediator();
        EscapeRule escapeRule = new EscapeRule(mediator);
        FightRule fightRule = new FightRule(mediator);
        TalkRule talkRule = new TalkRule(mediator);

        mediator.selectEscapeRule(escapeRule);
        mediator.selectFightRule(fightRule);
        mediator.selectTalkRule(talkRule);

        escapeRule.execute();

        System.out.println(escapeRule.getText());
        System.out.println("escapeRule is enabled--> " + escapeRule.getIsActivated());
        System.out.println("fightRule is enabled--> " + fightRule.getIsActivated());
        System.out.println("talkRule is enabled--> " + talkRule.getIsActivated());

        talkRule.execute();

        System.out.println(talkRule.getText());
        System.out.println("escapeRule is enabled--> " + escapeRule.getIsActivated());
        System.out.println("fightRule is enabled--> " + fightRule.getIsActivated());
        System.out.println("talkRule is enabled--> " + talkRule.getIsActivated());
    }
}
