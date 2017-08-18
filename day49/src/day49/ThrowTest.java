package day49;

public class ThrowTest {

	public static void main(String[] args) {
		
		ThrowTest t= new ThrowTest();
		
		try{
			t.Test();
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
	}
	public void Test() throws Exception{
		
		throw new Exception("这是手动抛出来的");
	}
}
