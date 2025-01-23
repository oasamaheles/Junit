package com.example.exam_final;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    TestEmailValidate.class,
    TestCountryCode.class,
    MyUnitTest.class

})
public class SuiteTest {

}
