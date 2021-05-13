
public class Main {

	public static void main(String[] args) {
		
	
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@engin.com");
		instructor.setPassword("12345");
		instructor.setLecturesHeGave("Java");
		instructor.setResume("Eðitmen");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Filiz");
		student.setLastName("Gürsan");
		student.setEmail("filiz@filiz.com");
		student.setPassword("3456");
		student.setChooseLesson("Java");
		student.setClassroom(1);
		student.setSchoolName("XX Okulu");
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		
		
		
	}

}
