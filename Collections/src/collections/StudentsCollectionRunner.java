package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Gaurav"), new Student(2, "Jaswant"), new Student(3, "Muskan"));
		System.out.println(students);

		List<Student> studentsAl = new ArrayList<>(students);

		System.out.println(studentsAl);

		/// Sort the arrayList : studentsAl
		Collections.sort(studentsAl);

		System.out.println(studentsAl);
	}

}
