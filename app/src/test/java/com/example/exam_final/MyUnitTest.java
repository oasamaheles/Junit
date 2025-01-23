package com.example.exam_final;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MyUnitTest {

    MyMath myMath;

    @Before
    public void init() {
        myMath = new MyMath();

    }

//    @Test(expected = ArithmeticException.class)
//    public void sub_validInput_success() {
//        int sub = myMath.sub(10, 5);
//        assertEquals(5, sub);
//    }



   @Test(timeout = 2) //todo الوقت الي مفروض ينجز خلاله test
   @Ignore("because Datatable")//todo هنا بنعتطي سبب ليش يعمل
   public void countryCode_validInput_success() {
       CommonFunction commonFunction = new CommonFunction();
       String code = commonFunction.getCountryCode("egypt");
       // Assert
       assertEquals("eg", code);
   }

    @Test
    public void countryCode_validInput_success3() {
        // Arrange
        CommonFunction commonFunction = new CommonFunction();

        // Act
        String code = commonFunction.getCountryCode("Egypt");

        // Assert
        assertEquals("eg", code);
    }

}

//
//@Before
//public void beforeTest() {
//    System.out.println("Before Test");
//}
//@Test
//public void testOne() {
//    System.out.println("Test One");
//}
//@Test
//public void testTwo() {
//    System.out.println("Test Two");
//}
//@Test
//public void testThree() {
//    System.out.println("Test Three");
//}
//@BeforeClass
//public static void beforeClassTest() {
//    System.out.println("Before Class Test");
//}
//
//@AfterClass
//public static  void afterClassTest() {
//    System.out.println("After Class Test");
//}
//
//
//@After
//public void afterTest() {
//    System.out.println("After Test");
//}
