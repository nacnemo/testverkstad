package se.nacnemo.designpatterns.behavioral.mediator;

class EscapeRule extends Rule implements Command {

    RuleMediator mediator;

    EscapeRule(RuleMediator mediator) {
        this.mediator = mediator;
        mediator.selectEscapeRule(this);
    }

    @Override
    public void execute() {
        mediator.createEscapeRule();
    }
}
