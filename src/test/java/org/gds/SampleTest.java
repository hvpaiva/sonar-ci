package org.gds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void testMain() {
        Sample sample = new Sample();
        var result = sample.run();
        Assertions.assertEquals("Hello world!", result);
    }
}
