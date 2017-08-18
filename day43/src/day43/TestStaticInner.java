package day43;

public class TestStaticInner {

		 static int count =1;
		
		public static void main(String[] args) {
			
			//创建静态类的对象
			TestStaticInner.Inner i =new TestStaticInner.Inner();
		}
	
		static class Inner{
		
				public void print(){
					System.out.println(count);
					}
	}
}
