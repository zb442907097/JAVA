package day47;

public class TryCatchTest {

		public static void main(String[] args) {
			
			int count=9;
			
			try{
				
			int temp=count/0;
			System.out.println("������...");
			
			}catch(ArithmeticException e){
				System.out.println("������ArithmeticException�쳣");
			}
			System.out.println("�������н���");
		}
}
