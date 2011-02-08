/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nacnemo.designpatterns.behavioral.strategy.sprite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.nacnemo.designpatterns.behavioral.strategy.behavior.fight.FightBehavior;
import se.nacnemo.designpatterns.behavioral.strategy.behavior.speak.SpeakBehavior;

/**
 *
 * @author clone
 */
public class FighterTest {

    public FighterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setSpeakBehavior method, of class Fighter.
     */
    @Test
    public void testSetSpeakBehavior() {
        System.out.println("setSpeakBehavior");
        SpeakBehavior speakBehavior = null;
        Fighter instance = new Fighter();
        instance.setSpeakBehavior(speakBehavior);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFightBehavior method, of class Fighter.
     */
    @Test
    public void testSetFightBehavior() {
        System.out.println("setFightBehavior");
        FightBehavior fightBehavior = null;
        Fighter instance = new Fighter();
        instance.setFightBehavior(fightBehavior);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performFight method, of class Fighter.
     */
    @Test
    public void testPerformFight() {
        System.out.println("performFight");
        Fighter instance = new Fighter();
        instance.performFight();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performSpeak method, of class Fighter.
     */
    @Test
    public void testPerformSpeak() {
        System.out.println("performSpeak");
        Fighter instance = new Fighter();
        instance.performSpeak();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}