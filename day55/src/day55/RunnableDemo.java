package day55;

public class RunnableDemo {

	public static void main(String[] args) {
		
		MyThread mt= new MyThread();
		Thread t= new Thread(mt);
		
		t.start();
		
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ö÷Ïß³Ì"+i);
		}
	}
}
