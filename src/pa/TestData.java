package pa;

import pa.students.Degree;
import pa.students.Grade;
import pa.students.Student;

public class TestData {

	public static Student[] STUDENTS = {
			new Student(1, "Mark", Degree.MEI),
			new Student(2, "Steve", Degree.METI),
			new Student(3, "Elon", Degree.MIG)
	};

	public static Grade[] GRADES = {
			new Grade(1, 20),
			new Grade(2, 14),
			new Grade(3, 8)
	};
}
