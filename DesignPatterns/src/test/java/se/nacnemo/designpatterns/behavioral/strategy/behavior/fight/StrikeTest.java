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
public class StrikeTest {

    public StrikeTest() {
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
     * Test of fight method, of class Strike.
     */
    @Test
    public void testFight() {
        System.out.println("fight");
        Strike instance = new Strike();
        instance.fight();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}