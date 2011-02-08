/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nacnemo.designpatterns.behavioral.strategy.behavior.fight;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author clone
 */
public class FightBehaviorTest {

    public FightBehaviorTest() {
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
     * Test of fight method, of class FightBehavior.
     */
    @Test
    public void testFight() {
        System.out.println("fight");
        FightBehavior instance = new FightBehaviorImpl();
        instance.fight();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FightBehaviorImpl implements FightBehavior {

        public void fight() {
        }
    }

}