/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nacnemo.designpatterns.behavioral.strategy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author clone
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({se.nacnemo.designpatterns.behavioral.strategy.StrategySimulatorTest.class,se.nacnemo.designpatterns.behavioral.strategy.sprite.SpriteSuite.class,se.nacnemo.designpatterns.behavioral.strategy.behavior.BehaviorSuite.class})
public class StrategySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}