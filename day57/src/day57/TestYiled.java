package day57;

public class TestYiled {

		public static void main(String[] args) {
			MyRunnable1 r1=new MyRunnable1();
			MyRunnable2 r2=new MyRunnable2();
			Thread t1=new Thread(r1);
			Thread t2=new Thread(r2);
			
			t1.start();
			t2.start();
			
		}
}
class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.print("+");
			Thread.yield();
		}
	}
	
}

class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.print("*");
			Thread.yield();
		}
	}
	
}
