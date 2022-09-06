package com.cekinmezyucel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void helloWorld() {
        String result = HelloWorld.helloWorld("Yucel");
        Assertions.assertEquals("Hello world Yucel!", result);
    }
}