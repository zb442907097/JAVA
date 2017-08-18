package day47;

public class TryCatchTest {

		public static void main(String[] args) {
			
			int count=9;
			
			try{
				
			int temp=count/0;
			System.out.println("检测程序...");
			
			}catch(ArithmeticException e){
				System.out.println("发生了ArithmeticException异常");
			}
			System.out.println("程序运行结束");
		}
}
