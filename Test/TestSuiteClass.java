import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ss.training.dayfive.BasicLambdaTest;
import com.ss.training.dayfive.CommaSeperatedStringTest;
import com.ss.training.dayfive.DateAndTimeTest;
import com.ss.training.dayfive.StringListTest;
import com.ss.training.dayfour.LineTest;
import com.ss.training.weekone.FunctionalTest;
import com.ss.training.weekone.LambdasTest;
import com.ss.training.weekone.RecursionTest;

/**
 * 
 */

/**
 * Test Suite Class for Week1 project
 * @author derrianharris
 *
 */
@RunWith(Suite.class)
@SuiteClasses({LineTest.class, BasicLambdaTest.class,CommaSeperatedStringTest.class,DateAndTimeTest.class,StringListTest.class,FunctionalTest.class,LambdasTest.class,RecursionTest.class})
public class TestSuiteClass {

}
