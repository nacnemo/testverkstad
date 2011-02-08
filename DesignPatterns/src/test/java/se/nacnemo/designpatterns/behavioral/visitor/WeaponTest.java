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
public class WeaponTest {

    public WeaponTest() {
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
     * Test of trigger method, of class Weapon.
     */
    @Test
    public void testTrigger() {
        System.out.println("trigger");
        Weapon instance = new Weapon();
        instance.trigger();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accept method, of class Weapon.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        Visitor visitor = null;
        Weapon instance = new Weapon();
        instance.accept(visitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}