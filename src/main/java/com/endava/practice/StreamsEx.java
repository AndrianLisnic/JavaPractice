package com.endava.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx {
    public static void streamsPractice(){
        List<String> carsList = Arrays.asList("Renault", "Toyota", "Mercedes", "Honda", "Opel", "Kia");
        carsList.stream().sorted().forEach(s -> System.out.println(s));

        List<String> carsWithShortName = carsList.stream().filter(s -> s.length()<5).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(carsWithShortName);

        List<Integer> number = Arrays.asList(1,2,3);
        System.out.println(number.stream().reduce(0,(sum,i) -> sum+i));

        List<Integer> oddNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(oddNumbers.stream().filter(n -> n%2==0).collect(Collectors.toList()));
    }
}
