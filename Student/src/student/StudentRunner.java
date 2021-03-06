package student;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {99, 98, 100};
		Student student = new Student("Gaurav", marks);
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks are : " + number);

		int sumMark = student.getSumMark();
		System.out.println("sum of all the marks is : " + sumMark);

		int maxMark = student.getMaxMark();
		System.out.println("Maximum marks are : " + maxMark);

		int minMark = student.getMinMark();
		System.out.println("Minimum marks are : " + minMark);

		BigDecimal average = student.getAveragemarks();
		System.out.println("Average of all marks is : " + average);

	}

}
