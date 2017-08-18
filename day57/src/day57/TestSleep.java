package day57;

public class TestSleep {

	
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++){
			
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
