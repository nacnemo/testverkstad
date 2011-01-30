/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nacnemo.designpatterns.behavioral.mediator;

/**
 *
 * @author apo
 */
public class TalkRule extends Rule implements Command {

    RuleMediator mediator;

    TalkRule(RuleMediator mediator) {
        this.mediator = mediator;
        mediator.selectTalkRule(this);
    }

    @Override
    public void execute() {
        mediator.createTalkRule();
    }
}
