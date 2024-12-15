package com.vineet.Comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableImpl {

    public static void main(String[] args) {


        List<Employees> listOfEmp = Arrays.asList(

                new Employees("Vineet", 10000),
                new Employees("Vias", 10000),
                new Employees("Lala", 20000),
                new Employees("Nikky", 30000),
                new Employees("Bhadu", 15000)
        );
        List<Employees> newlist = listOfEmp.stream().sorted(Comparator.comparing(Employees::getName).thenComparing(Employees::getSalary)).collect(Collectors.toList());
        newlist.stream().forEach(s-> System.out.println(s.getName()+ " "+s.getSalary()));

        List<Employees> maxSal=listOfEmp.stream().sorted(Comparator.comparing(Employees::getSalary,Comparator.reverseOrder())).collect(Collectors.toList());

        System.out.println(maxSal.stream().findFirst().get().getSalary());

    }


}
