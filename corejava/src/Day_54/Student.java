package Day_54;

public class Student extends Thread{
	String name;
	EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCoursesAndFees() {
		System.out.println("Available Courses: ");
		for(int i=0;i<institute.courses.length;i++) {
			System.out.println(institute.courses[i].courseId+". "+institute.courses[i].courseName+" - Fee: Rs. "+institute.courses[i].corseFee);
		}
		
//		for(Course c:institute.getCourses()) {
//			System.out.println(c);
//		}
	}
	
	public void viewOffers() {
		System.out.println("Ongoing Offers: ");
//		for(int i=0;i<institute.offers.length;i++) {
//			System.out.println(institute.offers[i].offerText);
//		}
		
		for(Offer o:institute.getOffers()) {
			System.out.println(o.getOfferText());
		}
	}
	
	public void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId,this.name);
	}
}

/*

class Student:
Attributes:
-> name (String): Name of the student.
-> institute (EducationInstitute): Reference to the education institute where the student interacts.

Methods:
-> Student(String name, EducationInstitute institute): Constructor to initialize the student with their name and the education institute reference.
-> viewCoursesAndFees(): Displays the available courses and their fees.
-> viewOffers(): Displays the ongoing offers.
-> enrollInCourse(int courseId): Enrolls the student in the specified course using the education institute’s enrollment process.

*/