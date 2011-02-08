package se.nacnemo.designpatterns.behavioral.mediator;

public class RuleMediator {

    EscapeRule escapeRule;
    FightRule fightRule;
    TalkRule talkRule;

    void selectEscapeRule(EscapeRule escapeRule) {
        this.escapeRule = escapeRule;
    }

    void selectFightRule(FightRule fightRule) {
        this.fightRule = fightRule;
    }

    void selectTalkRule(TalkRule talkRule) {
        this.talkRule = talkRule;
    }

    void createEscapeRule() {
        escapeRule.setIsActivated(true);
        fightRule.setIsActivated(false);
        talkRule.setIsActivated(false);
        escapeRule.setText("If monster is stronger then hero escape...");
    }

    void createFightRule() {
        escapeRule.setIsActivated(false);
        fightRule.setIsActivated(true);
        talkRule.setIsActivated(false);
        fightRule.setText("If feeling and is strong lets start a fight....");
    }

    void createTalkRule() {
        escapeRule.setIsActivated(false);
        fightRule.setIsActivated(false);
        talkRule.setIsActivated(true);
        talkRule.setText("If friendly then talk...");
    }
}
