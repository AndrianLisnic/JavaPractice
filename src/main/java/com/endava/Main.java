package com.endava;

import com.endava.practice.Generics;
import com.endava.practice.IOStreamsEx;
import com.endava.practice.ReflectionEx;
import com.endava.practice.StreamsEx;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException {
        StreamsEx.streamsPractice();
        IOStreamsEx.IOStreamsPractice();

        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        Generics.printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        Generics.printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        Generics.printArray(charArray);   // pass a Character array

        Generics.getObjectInfo(4);
        Generics.getObjectInfo((short) 5);
        Generics.getObjectInfo(6.2);
//        Generics.getObjectClass("aaa");




        //Practice Reflections:
        ReflectionEx reflectionEx = new ReflectionEx();

        Class neededClass = reflectionEx.getClass();
        Method method = null;
        try {
            method = neededClass.getDeclaredMethod("printText");
            method.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            method.invoke(reflectionEx);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
