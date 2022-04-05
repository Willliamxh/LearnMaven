package com.bjp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("xuhanTest");
    }

    @Test
    public void testMaven(){
        HelloMaven helloMaven = new HelloMaven();
        int add = helloMaven.add(12, 12);
        System.out.println(add);
    }


}
