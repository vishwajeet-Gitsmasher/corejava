package Day_54;

import java.util.Arrays;

public class EducationInstitute{
	Course[] courses;
	Offer[] offers;
	
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}

	@Override
	public String toString() {
		return "EducationInstitute [couses=" + Arrays.toString(courses) + ", offers=" + Arrays.toString(offers) + "]";
	}

	public Course[] getCourses() {
		return courses;
	}

	public Offer[] getOffers() {
		return offers;
	}
	
	public synchronized void enrollStudentInCourse(int courseId, String studentName) {
		String course = "";
		for(int i=0;i<courses.length;i++) {
			if(courses[i].courseId==courseId) {
				course = courses[i].courseName;
			}
		}
		if(course.length()!=0) {
			System.out.println(studentName+" has enrolled in the course: "+course);
		} else {
			System.out.println("Invalid Course ID");
		}
	}
}



/*
class EducationInstitute:
Attributes:
-> courses (Course[]): An array to store the available courses.
-> offers (Offer[]): An array to store ongoing offers.

Methods:
-> EducationInstitute(): Constructor to initialize courses and offers.
-> getCourses(): Returns the array of available courses.
-> getOffers(): Returns the array of ongoing offers.
-> enrollStudentInCourse(int courseId, String studentName): Simulates the enrollment process and prints a message when a student -> enrolls in a course.

*/