package day54;

public class ThreadDemo {

		public static void main(String[] args){
			MyThread mt= new MyThread();
			mt.start();
			
			for(int i=0;i<10;i++){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("主线程"+i);
			}
			System.out.println("程序执行完毕");
		}
}
