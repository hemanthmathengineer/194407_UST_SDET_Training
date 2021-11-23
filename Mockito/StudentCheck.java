
public class StudentCheck {
	private StudentService service;
	public StudentService getService() {
		return service;
	}
	public void setService(StudentService service) {
		this.service = service;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	private Student student;

}
