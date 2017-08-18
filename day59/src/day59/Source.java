package day59;

public class Source {

		synchronized void method1(){
			System.out.println("进入method1方法，获得锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("method1执行完毕，释放锁");
		}
		
		
		synchronized void method2(){
			System.out.println("进入method2方法，获得锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("method2执行完毕，释放锁");
		}
}
