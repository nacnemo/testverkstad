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
public class PrintVisitorTest {

    public PrintVisitorTest() {
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
     * Test of visit method, of class PrintVisitor.
     */
    @Test
    public void testVisit_Hero() {
        System.out.println("visit");
        Hero hero = null;
        PrintVisitor instance = new PrintVisitor();
        instance.visit(hero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class PrintVisitor.
     */
    @Test
    public void testVisit_Monster() {
        System.out.println("visit");
        Monster monster = null;
        PrintVisitor instance = new PrintVisitor();
        instance.visit(monster);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class PrintVisitor.
     */
    @Test
    public void testVisit_Weapon() {
        System.out.println("visit");
        Weapon weapon = null;
        PrintVisitor instance = new PrintVisitor();
        instance.visit(weapon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class PrintVisitor.
     */
    @Test
    public void testVisit_Story() {
        System.out.println("visit");
        Story story = null;
        PrintVisitor instance = new PrintVisitor();
        instance.visit(story);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}