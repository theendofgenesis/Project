/**
* @author Ken Hyatt, Genesis Stroud, David Rose, David McCarter
* @version 4
*/

package xmlreader;
import org.w3c.dom.NodeList;

import xmlreader.Xmlinput;


public class Calculatetrack {


	/**
	* Static variable that keeps track of how many semesters the student needs.
	*/
	public int numOfSemesters = 0;

	/**
	* Method Determines if given course is in the spring
	* summer or fall semester by reading the semester tag in the course catalog
	*
	* @param n node of the class that is queried
	* @return Returns true or false depending on what is read from the course catalog
	*/
public static boolean pickSemester(NodeList n) {

	return false;

}

	/**
	* Sets the limit determined by the user of credit hours that make up
	* a semester. This method adds the value of the "hours" elements in each course in the Node List.
	* As soon as the number reaches at or just under the number of hours set by the user,
	* it completes the semester
	* @return The Maximum number of course hours in a semester
	*/
public static int courseHourLimit() {
	return 0;

}



/**
* Checks the requirements of a given class against pre-defined requirements
*
*/
public static void checkRequirement() {

}



}
