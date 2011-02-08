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
public class VisitorTest {

    public VisitorTest() {
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
     * Test of visit method, of class Visitor.
     */
    @Test
    public void testVisit_Hero() {
        System.out.println("visit");
        Hero hero = null;
        Visitor instance = new VisitorImpl();
        instance.visit(hero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class Visitor.
     */
    @Test
    public void testVisit_Monster() {
        System.out.println("visit");
        Monster monster = null;
        Visitor instance = new VisitorImpl();
        instance.visit(monster);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class Visitor.
     */
    @Test
    public void testVisit_Weapon() {
        System.out.println("visit");
        Weapon weapon = null;
        Visitor instance = new VisitorImpl();
        instance.visit(weapon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class Visitor.
     */
    @Test
    public void testVisit_Story() {
        System.out.println("visit");
        Story story = null;
        Visitor instance = new VisitorImpl();
        instance.visit(story);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VisitorImpl implements Visitor {

        public void visit(Hero hero) {
        }

        public void visit(Monster monster) {
        }

        public void visit(Weapon weapon) {
        }

        public void visit(Story story) {
        }
    }

}