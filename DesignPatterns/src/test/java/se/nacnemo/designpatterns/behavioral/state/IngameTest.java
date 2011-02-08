/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nacnemo.designpatterns.behavioral.state;

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
public class IngameTest {

    public IngameTest() {
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
     * Test of runEngine method, of class Ingame.
     */
    @Test
    public void testRunEngine() {
        System.out.println("runEngine");
        GameContext wrapper = null;
        Ingame instance = new Ingame();
        instance.runEngine(wrapper);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}