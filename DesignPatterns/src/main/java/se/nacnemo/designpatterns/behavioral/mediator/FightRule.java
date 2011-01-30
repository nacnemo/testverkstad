/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nacnemo.designpatterns.behavioral.mediator;

/**
 *
 * @author apo
 */
public class FightRule extends Rule implements Command {

    RuleMediator mediator;

    FightRule(RuleMediator mediator) {
        this.mediator = mediator;
        mediator.selectFightRule(this);
    }

    @Override
    public void execute() {
        mediator.createFightRule();
    }
}
