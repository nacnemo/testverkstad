/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nacnemo.designpatterns.behavioral.mediator;

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
public class RuleTest {

    public RuleTest() {
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
     * Test of getIsActivated method, of class Rule.
     */
    @Test
    public void testGetIsActivated() {
        System.out.println("getIsActivated");
        Rule instance = new Rule();
        Boolean expResult = null;
        Boolean result = instance.getIsActivated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsActivated method, of class Rule.
     */
    @Test
    public void testSetIsActivated() {
        System.out.println("setIsActivated");
        Boolean isActivated = null;
        Rule instance = new Rule();
        instance.setIsActivated(isActivated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Rule.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Rule instance = new Rule();
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class Rule.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Rule instance = new Rule();
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}