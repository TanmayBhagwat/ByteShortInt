package com.Tanmay;

public class Main {

    public static void main(String[] args) {

        /*
        //Int is represented in 32 bits
        int myMinValue=-2_147_483_648;
        int myMaxValue=2_147_483_647;
        int myTotal=(myMinValue/2);
        System.out.println("myTotal =" + myTotal);

        //byte is represented in 8 bits
        byte myByteValue=-128;
        byte myNewByteValue=(byte)(myByteValue/2);
        System.out.println("myNewByteValue =" + myByteValue);

        //short is represented in 16 bits
        short myShortValue=-32768;
        short myNewShortValue=(short)(myShortValue/2);
        System.out.println("myNewShortValue =" + myNewShortValue);

        //long is represented in 64 bits
        long myLongValue=9_223_036_775_807L;
        */

        byte byteValue=10;
        byte shortValue=20;
        int intValue=50;

        long longTotal=50000L+10L*(byteValue+shortValue+intValue);
        short shortTotal=(short)(1000+10*(byteValue+shortValue+intValue));

        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
