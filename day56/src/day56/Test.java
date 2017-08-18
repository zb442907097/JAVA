package day56;

public class Test {

	public static void main(String[] args) {
		
		MyRunnable1 r1=new MyRunnable1();
		MyRunnable2 r2= new MyRunnable2();
		
		Thread t1 =new Thread(r1);
		Thread t2 =new Thread(r2);
		
		System.out.println("t1的优先级:"+t1.getPriority());
		System.out.println("t2的优先级:"+t2.getPriority());
		

		//给t1设置优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("改变之后的t1的优先级:"+t1.getPriority());
		
		//给t2设置成最低的优先级
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("改变之后的t2的优先级:"+t2.getPriority());
		
		t1.start();//就绪状态
		t2.start();//就绪状态
	}
}
