package socProgram;

public class Student {

	String name;
	String jnumber;
	String expectedgraddate;
	String catyear;
	Boolean summerclasses;
	String[] completedcourses;
	String[] nexttermcourses;

	public Student(String name, String jnumber, String expectedgraddate, String catyear, Boolean summerclasses, String[] completedcourses, String[] nexttermcourses) {

		this.name = name;
		this.jnumber = jnumber;
		this.expectedgraddate = expectedgraddate;
		this.catyear = catyear;
		this.summerclasses = summerclasses;
		this.completedcourses = completedcourses;
		this.nexttermcourses = nexttermcourses;
	}


	//getter methods

	public String getName() {

		return name;
	}

	public String getJnumber() {
		return jnumber;
	}

	public String getExpectedGradDate() {
		return expectedgraddate;
	}

	public String getCatYear() {
		return catyear;
	}

	public Boolean getSummerClasses() {
		return summerclasses;
	}

	public String[] getCompletedCourses() {
		return completedcourses;
	}

	public String[] getNextTermCourses() {
		return nexttermcourses;
	}

	//setter methods

	public String setName(String name) {
		return this.name = name;

	}

	public String setJnumber(String jnumber) {
		return this.jnumber = jnumber;
	}

	public String setExpectedGradDate(String expectedgraddate) {
		return this.expectedgraddate = expectedgraddate;
	}

	public String setCatYear(String catyear) {
		return this.catyear = catyear;
	}

	public Boolean setSummerClasses(Boolean summerclasses) {
		return this.summerclasses = summerclasses;
	}

	public String[] setCompletedCourses(String[] completedcourses) {
		return this.completedcourses = completedcourses;
	}

	public String[] setNextTermCourses(String[] nexttermcourses) {
		return this.nexttermcourses = nexttermcourses;
	}

	public String toString() {

		System.out.println(

				"Name is " + name + '\n' +
				"Jnumber is " + jnumber + '\n' +
				"Expected Grad Date is " + expectedgraddate + '\n' +
				"Catalog Year is " + catyear + '\n' +
				"Taking Summer Classes? " + summerclasses + '\n' +
				"List of Completed Courses: " + completedcourses + '\n' +
				"Classes you want to take next: "



				);

		return "Name is " + name + '\n' +
				"Jnumber is " + jnumber + '\n' +
				"Expected Grad Date is " + expectedgraddate + '\n' +
				"Catalog Year is " + catyear + '\n' +
				"Taking Summer Classes? " + summerclasses + '\n' +
				"List of Completed Courses: " + completedcourses + '\n' +
				"Classes you want to take next: ";
	}
}
