/**
* @author Ken Hyatt, Genesis Stroud, David Rose, David McCarter
* @version 2
*/

package socProgram;


/**
* The primary data storage object. It stores all data about the student.
*
*/
public class Student {

	String name;
	String jnumber;
	String expectedgraddate;
	String catyear;
	Boolean summerclasses;
	String[] completedcourses;
	String[] nexttermcourses;

	/**
	* The Student Constructor
	* @param name Name of the student
	* @param jnumber JNumber of the student
	* @param expectedgraddate stores the students expected grad date. Used for determining the length of semester and distance to graduation
	* @param catyear Sets the Catalog Year
	* @param summerclasses Holds whether or not the student is willing to take summer classes
	* @param completedcourses Stores the titles of the completed courses the student submits
	* @param nexttermcourses Holds the list of upcoming courses in the next semester
	*/
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

	/**
	* @return Name of the student
	*/
	public String getName() {

		return name;
	}

	/**
	* @return JNumber of the student
	*/
	public String getJnumber() {
		return jnumber;
	}

	/**
	* @return the expected graduation date of the student
	*/
	public String getExpectedGradDate() {
		return expectedgraddate;
	}

	/**
	* @return the catalog year of the student
	*/
	public String getCatYear() {
		return catyear;
	}

	/**
	* @return true or false if the student is willing to take summer classes
	*/
	public Boolean getSummerClasses() {
		return summerclasses;
	}

	/**
	* @return list of courses the student has completed
	*/
	public String[] getCompletedCourses() {
		return completedcourses;
	}

	/**
	* @return list of courses the student will take the next semester
	*/
	public String[] getNextTermCourses() {
		return nexttermcourses;
	}

	//setter methods


	/**
	* Sets the name of the student
	* @param name of student
	* @return name of the student
	*/
	public String setName(String name) {
		return this.name = name;

	}

	/**
	* Sets the JNumber of the student
	* @param jnumber of the student
	* @return jnumber of the student
	*/
	public String setJnumber(String jnumber) {
		return this.jnumber = jnumber;
	}

	/**
	* Sets the expected grad date of the student
	* @param expectedgraddate Graduation Date of the student
	* @return expectedgraddate Graduation Date of the student
	*/
	public String setExpectedGradDate(String expectedgraddate) {
		return this.expectedgraddate = expectedgraddate;
	}

	/**
	* Sets the catalog year of the student
	* @param catyear Catalog Year the student is using
	* @return catyear Catalog Year the student is using
	*/
	public String setCatYear(String catyear) {
		return this.catyear = catyear;
	}

	/**
	* Sets whether or not the student is willing to take summer classes
	* @param summerclasses Boolean summer class value
	* @return summerclasses Boolean summer class value
	*/
	public Boolean setSummerClasses(Boolean summerclasses) {
		return this.summerclasses = summerclasses;
	}

	/**
	* adds a course to the list of courses the student has completed
	* @param completedcourses List of courses the student has completed
	* @return completedcourses List of courses the student has completed
	*/
	public String[] setCompletedCourses(String[] completedcourses) {
		return this.completedcourses = completedcourses;
	}

	/**
	* Sets the courses the student has to take in the next semester
	* @param nexttermcourses List of courses to take next semester
	* @return nexttermcourses List of courses to take next semester
	*/
	public String[] setNextTermCourses(String[] nexttermcourses) {
		return this.nexttermcourses = nexttermcourses;
	}

	/**
	* Overrides and Prints out the entire student object
	* @return The data in the student object
	*/
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
