package se.nacnemo.designpatterns.behavioral.strategy.sprite;

import se.nacnemo.designpatterns.behavioral.strategy.behavior.fight.FightBehavior;
import se.nacnemo.designpatterns.behavioral.strategy.behavior.speak.SpeakBehavior;


/**
 * Created by IntelliJ IDEA.
 * User: chrisy
 * Date: 1/30/11
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fighter{

	private SpeakBehavior speakBehavior;
	private FightBehavior fightBehavior;

	public void setSpeakBehavior(SpeakBehavior speakBehavior){
		this.speakBehavior = speakBehavior;
	}

	public void setFightBehavior(FightBehavior fightBehavior){
		this.fightBehavior = fightBehavior;
	}

	public void performFight(){
		fightBehavior.fight();
	}

	public void performSpeak(){
		speakBehavior.speak();
	}



}
