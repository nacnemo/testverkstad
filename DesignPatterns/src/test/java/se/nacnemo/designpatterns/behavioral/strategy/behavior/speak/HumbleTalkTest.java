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
public class HumbleTalkTest {

    public HumbleTalkTest() {
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
     * Test of speak method, of class HumbleTalk.
     */
    @Test
    public void testSpeak() {
        System.out.println("speak");
        HumbleTalk instance = new HumbleTalk();
        instance.speak();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}