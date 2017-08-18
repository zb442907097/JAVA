package day57;

public class TestJoin {

		public static void main(String[] args) {
			
			MyThread mt =new MyThread();
			mt.start();
			
			for(int i=0;i<10;i++){
				if(i==5){
					try {
						mt.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("+++++++++");
			}
		}
}
class MyThread extends Thread{
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("*********");
		}
	}
}