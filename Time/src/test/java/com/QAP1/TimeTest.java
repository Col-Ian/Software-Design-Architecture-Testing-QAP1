package com.QAP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    Time t1 = new Time(23, 59, 59);
    Time t2 = new Time(0, 0, 0);

    @Test
    public void testNextSecond(){
        t1.nextSecond();

        Assertions.assertTrue(t1.getHour()==0);
        Assertions.assertTrue(t1.getMinute()==0);
        Assertions.assertTrue(t1.getSecond()==0);

        System.out.println(t1);
    }

    @Test
    public void testPreviousSecond(){
        t2.previousSecond();

        Assertions.assertTrue(t2.getHour()==23);
        Assertions.assertTrue(t2.getMinute()==59);
        Assertions.assertTrue(t2.getSecond()==59);

        System.out.println(t2);
    }
}
