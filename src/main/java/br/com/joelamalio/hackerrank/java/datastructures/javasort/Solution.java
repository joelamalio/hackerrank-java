package br.com.joelamalio.hackerrank.java.datastructures.javasort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o2.getCgpa() != o1.getCgpa()) {
					return Double.compare(o2.getCgpa(), o1.getCgpa());
				} else if (!o2.getFname().equals(o1.getFname())){
					return o1.getFname().compareTo(o2.getFname());
				}
				return Integer.compare(o1.getId(), o2.getId());
			}
			
		});

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
