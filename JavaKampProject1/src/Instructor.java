
public class Instructor extends User {
	
	private String lecturesHeGave;
	private String resume;
	
	public Instructor() {
		
	}
	public Instructor(String lecturesHeGave, String resume) {
		super();
		this.lecturesHeGave = lecturesHeGave;
		this.resume = resume;
	}
	public String getLecturesHeGave() {
		return lecturesHeGave;
	}
	public void setLecturesHeGave(String lecturesHeGave) {
		this.lecturesHeGave = lecturesHeGave;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	
	
	

}
