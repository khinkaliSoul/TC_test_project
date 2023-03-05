package org.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTestWithDelays.class,
        CalculatorTest_1.class
})
public class TestSuite {
}