/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nacnemo.designpatterns.behavioral.visitor;

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
public class StoryTest {

    public StoryTest() {
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
     * Test of getElements method, of class Story.
     */
    @Test
    public void testGetElements() {
        System.out.println("getElements");
        Story instance = new Story();
        Element[] expResult = null;
        Element[] result = instance.getElements();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accept method, of class Story.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        Visitor visitor = null;
        Story instance = new Story();
        instance.accept(visitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}