package Person;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setCollegeName("Indian Institute of Technology, Mandi");
//		student.setName("Gaurav Kumar");
//		student.setEmail("gauravkumarbtp@gmail.com");
//		student.setPhoneNumber("9587761292");
//		student.setYear(2020);
//
//		System.out.println("Name - " + student.getName() + " College Name - " + student.getCollegeName() + "Email - "
//				+ student.getEmail() + "Phone Number - " + student.getPhoneNumber());
//
//		Student st1 = new Student();
//
//		st1.setCollegeName("gauravkumarbtp@gmail.com");
//		st1.setName("MeraNaam");
//		String value = st1.toString();
//		System.out.println(value);
//		System.out.println(st1);

		Employee employee = new Employee();
		employee.setName("Gaurav Kumar");
		employee.setEmail("gauravkumarbtp@gmail.com");
		employee.setPhoneNumber("9587761292");
		employee.setEmployeeGrade('E');
		employee.setTitle("Programmer Analyst");

		System.out.println(employee);
	}

}
