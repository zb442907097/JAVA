package day43;

public class TestStaticInner {

		 static int count =1;
		
		public static void main(String[] args) {
			
			//������̬��Ķ���
			TestStaticInner.Inner i =new TestStaticInner.Inner();
		}
	
		static class Inner{
		
				public void print(){
					System.out.println(count);
					}
	}
}
