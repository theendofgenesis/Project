package socProgram;

public class Student {

	String name;
	String jnumber;
	int expectedgraddate;
	String focus;
	Boolean summerclasses;
	String[] completedcourses;
	String[] nexttermcourses;

	public Student(String name, String jnumber,int expectedgraddate, String focus, Boolean summerclasses, String[] completedcourses, String[] nexttermcourses) {

		this.name = name;
		this.jnumber = jnumber;
		this.expectedgraddate = expectedgraddate;
		this.focus = focus;
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

	public int getExpectedGradDate() {
		return expectedgraddate;
	}

	public String getFocus() {
		return focus;
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

	public int setExpectedGradDate(int expectedgraddate) {
		return this.expectedgraddate = expectedgraddate;
	}

	public String setFocus(String focus) {
		return this.focus = focus;
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
				"Focus is " + focus + '\n' +
				"Taking Summer Classes? " + summerclasses + '\n' +
				"List of Completed Courses: " + completedcourses + '\n' +
				"Classes you want to take next: "



				);

		return "Name is " + name + '\n' +
				"Jnumber is " + jnumber + '\n' +
				"Expected Grad Date is " + expectedgraddate + '\n' +
				"Focus is " + focus + '\n' +
				"Taking Summer Classes? " + summerclasses + '\n' +
				"List of Completed Courses: " + completedcourses + '\n' +
				"Classes you want to take next: ";
	}
}