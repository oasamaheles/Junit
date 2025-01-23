package com.example.exam_final;

import com.example.exam_final.helper.EmailValidator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestEmailValidate {
    EmailValidator emailValidator;
    public String email;

    public TestEmailValidate(String email){
        this.email = email;
    }

    @Before
    public void init(){
        emailValidator = new EmailValidator();
    }
    // هاي بتقوم بعمل أكثر من فحص في مكان واحد على الليستا todo

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[]{
           "omer@gmail.com", "osamahillis12345@gmail.com", "ohillis@ucas.edu.ps",
            "osamahillis8@gmail.com","osamahillis3@gmail.com"
        });
    }


    @Test
    public void emailValidator_validInput_success(){
        assertTrue(EmailValidator.isValidEmail(email));
    }



}


/*
@Test
public void emailValidator2_invalidInput_success(){
    String email = "osamahillis@gmail.com";
    boolean result = EmailValidator.isValidEmail(email);
    assertTrue(result);
}
@Test
public void emailValidator3_invalidInput_faild(){
    String email = "osamahillis@gmail.com";
    boolean result = EmailValidator.isValidEmail(email);
    assertFalse(result);
}
@Test
public void emailValidator4_invalidInput_success(){
    String email = "hillis_2@gmail.com";
    boolean result = EmailValidator.isValidEmail(email);
    assertFalse(result);
}
*/
