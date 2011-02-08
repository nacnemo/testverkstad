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
public class RuleMediatorTest {

    public RuleMediatorTest() {
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
     * Test of selectEscapeRule method, of class RuleMediator.
     */
    @Test
    public void testSelectEscapeRule() {
        System.out.println("selectEscapeRule");
        EscapeRule fromRule = null;
        RuleMediator instance = new RuleMediator();
        instance.selectEscapeRule(fromRule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectFightRule method, of class RuleMediator.
     */
    @Test
    public void testSelectFightRule() {
        System.out.println("selectFightRule");
        FightRule toRule = null;
        RuleMediator instance = new RuleMediator();
        instance.selectFightRule(toRule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectTalkRule method, of class RuleMediator.
     */
    @Test
    public void testSelectTalkRule() {
        System.out.println("selectTalkRule");
        TalkRule ccRule = null;
        RuleMediator instance = new RuleMediator();
        instance.selectTalkRule(ccRule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEscapeRule method, of class RuleMediator.
     */
    @Test
    public void testCreateEscapeRule() {
        System.out.println("createEscapeRule");
        RuleMediator instance = new RuleMediator();
        instance.createEscapeRule();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFightRule method, of class RuleMediator.
     */
    @Test
    public void testCreateFightRule() {
        System.out.println("createFightRule");
        RuleMediator instance = new RuleMediator();
        instance.createFightRule();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTalkRule method, of class RuleMediator.
     */
    @Test
    public void testCreateTalkRule() {
        System.out.println("createTalkRule");
        RuleMediator instance = new RuleMediator();
        instance.createTalkRule();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}