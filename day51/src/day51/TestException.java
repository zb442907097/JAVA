package day51;

public class TestException {

		public static void main(String[] args) {
			
			MyException me=new MyException();
			System.out.println();
		}
		
}

//�����Լ����쳣
class MyException extends Exception{
		public MyException(){
			
		}
		public MyException(String ex){
			
		}
}