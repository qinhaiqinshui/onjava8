package test;

import static org.junit.Assert.assertEquals;

import main.DemoEnum;

import org.junit.Test;

public class TestDemoEnum {
    @Test
    public void testDraw(){
        assertEquals("RED",DemoEnum.RED.name());
    }
}
