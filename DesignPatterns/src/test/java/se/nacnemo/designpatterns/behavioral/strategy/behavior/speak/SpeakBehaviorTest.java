/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nacnemo.designpatterns.behavioral.strategy.behavior.speak;

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
public class SpeakBehaviorTest {

    public SpeakBehaviorTest() {
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
     * Test of speak method, of class SpeakBehavior.
     */
    @Test
    public void testSpeak() {
        System.out.println("speak");
        SpeakBehavior instance = new SpeakBehaviorImpl();
        instance.speak();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SpeakBehaviorImpl implements SpeakBehavior {

        public void speak() {
        }
    }

}