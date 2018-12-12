package com.bassettmason.spring;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationControllerTest {

    @Test
    public void upperCaseTest() {

        assertEquals("OH HELLO MARK", ApplicationController.capitalizeString("oh hello mark"));
        assertEquals("AAAAAA", ApplicationController.capitalizeString("aaaaaa"));
        assertEquals("12345", ApplicationController.capitalizeString("12345"));

    }
}