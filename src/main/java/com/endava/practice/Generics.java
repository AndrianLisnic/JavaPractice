package com.endava.practice;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    // generic method printArray
    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static < N extends Number> void getObjectInfo(N objectParameter){
        System.out.println();
        System.out.printf("You have sent a '%s' object. Value=  '%s'", objectParameter.getClass().getName(), objectParameter );
        System.out.println();

         Method[] methodsArray = objectParameter.getClass().getMethods();
         List<String> methodsNamesArray = new ArrayList<>();
         for (Method concreteMethod : methodsArray){
             methodsNamesArray.add(concreteMethod.getName());
         }
        System.out.println(objectParameter.getClass().getName() + " class has the methods: " + methodsNamesArray);

    }

}
