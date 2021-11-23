import static org.mockito.Mockito.*;

public class StudentCheckTester {
	public StudentCheck check;
	public StudentService service;
	
	public static void main(String[] args) {
		StudentCheckTester test = new StudentCheckTester();
		test.intialise();
		//System.out.println(test.testcase1());
		test.testcase1();
	}
	
	public void intialise() {
		check = new StudentCheck();
		service = mock(StudentService.class);
		check.setService(service);
	}
	
	public void testcase1() {
		Student s = new Student("hemanth",24);
		check.setStudent(s);
		when(service.display(s)).thenReturn("hemanth");
	}

}
