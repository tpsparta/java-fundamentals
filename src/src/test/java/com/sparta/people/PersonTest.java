package com.sparta.people;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;

public class PersonTest {

    @ParameterizedTest
    @DisplayName("Test")
    public void test_1(String str)
    {
        Assertions.assertEquals("blah", str);
    }

}
