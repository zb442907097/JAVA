package day46;

public class ClassCastExceptionTest {

		public static void main(String[] args) {
			People p1 =new Student();
			Student s1 =(Student)p1;
		}
}
class People{
	
}
class Student extends People{
	private String name;
	
}
class Teacher extends People{
	
}
