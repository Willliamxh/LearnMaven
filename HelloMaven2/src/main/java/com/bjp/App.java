package com.bjp;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HelloMaven helloMaven = new HelloMaven();
        int add = helloMaven.add(12, 23);
        System.out.println(add);
    }
}
