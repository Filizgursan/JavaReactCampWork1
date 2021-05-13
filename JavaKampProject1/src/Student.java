
public class Student extends User{
	
	private int classroom;
	private String chooseLesson;
	private String schoolName;
	
	public Student() {

	}
	public Student(int classroom, String chooseLesson, String schoolName) {
		super();
		this.classroom = classroom;
		this.chooseLesson = chooseLesson;
		this.schoolName = schoolName;
	}
	
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getChooseLesson() {
		return chooseLesson;
	}
	public void setChooseLesson(String chooseLesson) {
		this.chooseLesson = chooseLesson;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}
