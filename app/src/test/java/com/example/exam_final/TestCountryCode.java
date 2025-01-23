package com.example.exam_final;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestCountryCode {

    CommonFunction commonFunction;
    private String expectedCountryCode;
    private String countryName;

    public TestCountryCode(String expectedCountryCode, String countryName) {
        this.expectedCountryCode = expectedCountryCode;
        this.countryName = countryName;
    }

    @Before
    public void init() {
        commonFunction = new CommonFunction();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(
            new Object[][]{
                {"eg", "Egypt"},
                {"us", "United States"},
                {"sa", "Saudi Arabia"},
                {"is", "Israel"}
            }
        );
    }

    @Test
    public void countryCode_validInput_success() {
        String countryCode = commonFunction.getCountryCode(countryName);
        assertEquals(expectedCountryCode, countryCode);
    }
}
