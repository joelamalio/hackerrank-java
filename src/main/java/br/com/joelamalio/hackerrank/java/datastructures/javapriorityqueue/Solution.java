package br.com.joelamalio.hackerrank.java.datastructures.javapriorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}

class Student {

	private int id;
	private String name;
	private double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class Priorities {

	public List<Student> getStudents(List<String> events) {
		List<Student> students = new ArrayList<Student>();
		
		for (String event : events) {
			String[] values = event.split(" ");
			
			if ("ENTER".equals(values[0])) {
				students.add(new Student(Integer.valueOf(values[3]), values[1], Double.valueOf(values[2])));
				
				Collections.sort(students, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						if (o2.getCgpa() != o1.getCgpa()) {
							return Double.compare(o2.getCgpa(), o1.getCgpa());
						} else if (!o1.getName().equals(o2.getName())) {
							return o1.getName().compareTo(o2.getName());
						}
						return Integer.compare(o1.getId(), o2.getId());					
					}
					
				});
			} else if ("SERVED".equals(values[0]) && !students.isEmpty()) {
				students.remove(0);
			}
		}
		
		return students;
	}

}
