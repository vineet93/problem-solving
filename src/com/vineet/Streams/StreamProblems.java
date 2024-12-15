package com.vineet.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamProblems {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10);
        String inputString = "Java Concept Of The Day";
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        // 1.) Given a list of integers, separate odd and even numbers.
       Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(s->s%2==0));
       map.entrySet().stream().forEach(System.out::println);


       // 2.) How do you remove duplicate elements from a list using Java 8 streams
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();



        //3.) How do you find frequency of each integer in a list using Java 8 streams.

        Map<Integer,Long> map1= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map1.entrySet().stream().forEach(s-> System.out.print(s+","));
        System.out.println();

        //4.) How do you find frequency of each character in a string using Java 8 streams?

        Map<Character,Long> map2 = inputString.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map2.entrySet().stream().forEach(s-> System.out.print(s+","));
        System.out.println();

        //5.) How do you find frequency of each element in an array or a list?
        Map<String,Long> map3= stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map3.entrySet().stream().forEach(System.out::print);
        System.out.println();

        //6.) How do you sort the given list of decimals in reverse order?
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s+","));
        System.out.println();

        //7.) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        String joindString=listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joindString);

        //8.) From the given list of integers, print the numbers which are multiples of 5?
        list.stream().filter(s->s%5==0).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();

        //9.) Given a list of integers, find maximum and minimum of those numbers?

        Integer min=list.stream().min(Comparator.naturalOrder()).get();
        Integer max=list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(min);
        System.out.println(max);

        //10 How do you merge two unsorted arrays into single sorted array using Java 8 streams?

        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 1, 9, 5};

        int[] c=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

        //11. How do you merge two unsorted arrays into single sorted array without duplicates?

        int[] d= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(d));

        //12.) How do you get three maximum numbers and three minimum numbers from the given list of integers?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().sorted().limit(3).forEach(s-> System.out.print(s+","));
        System.out.println();
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(s-> System.out.print(s+","));
        System.out.println();

        //13.) Java 8 program to check if two strings are anagrams or not?

        String s1 = "RaceCar";
        String s2 = "CarRace";

         s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

         if(s1.equals(s2)){
             System.out.println("Strings are anagram");
         } else {
             System.out.println("Strings are not anagram");
         }

         //14.Find sum of all digits of a number in Java 8?

            int i = 15623;

            Integer sumOfDigit=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
            System.out.println(sumOfDigit);

            //15. Find second largest number in an integer array?

         List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

         Integer secMax = listOfIntegers1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
         System.out.println("Second Max "+ secMax);

         //16. Given a list of strings, sort them according to increasing order of their length?

        List<String> listOfStrings2 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        listOfStrings2.stream().sorted(Comparator.comparing(String::length)).forEach(s-> System.out.print(s+","));
        System.out.println();

        //17. Given an integer array, find sum and average of all elements?

        int[] f = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum=Arrays.stream(f).sum();
        double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Sum is "+sum+" Average is "+average);
    }
}
