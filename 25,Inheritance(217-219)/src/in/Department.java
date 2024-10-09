package in;

import java.util.List;

/*
 * Department class contains list of student Objects. It is associated with
 * student class through its Object(s).
 */
class Department {

	String dname;
	private List<Student> students;

	Department(String dname, List<Student> students) {

		this.dname = dname;
		this.students = students;

	}

	public List<Student> getStudents() {
		return students;
	}
}