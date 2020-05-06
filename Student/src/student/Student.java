package student;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getSumMark() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMinMark() {
		int min = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAveragemarks() {

		int sum = getSumMark();
		int number = getNumberOfMarks();

		BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		return avg;
	}

	public int getMaxMark() {
		int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
	}

}
