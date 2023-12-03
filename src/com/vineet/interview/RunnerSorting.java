package com.vineet.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RunnerSorting {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(2,"vineet","khare"));
		list.add(new Student(4,"akash","shrivastav"));
		list.add(new Student(3,"yash","pagal"));
		list.add(new Student(1,"nikky","batla"));
		
		list.forEach(s->{System.out.println(s.getId()+ " " + s.getFirstName()+" " + s.getLastname());});
		Collections.sort(list);
		list.forEach(Student->{System.out.println(Student.getId()+ " " + Student.getFirstName()+" " + Student.getLastname());});

	}

}
