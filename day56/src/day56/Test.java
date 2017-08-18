package day56;

public class Test {

	public static void main(String[] args) {
		
		MyRunnable1 r1=new MyRunnable1();
		MyRunnable2 r2= new MyRunnable2();
		
		Thread t1 =new Thread(r1);
		Thread t2 =new Thread(r2);
		
		System.out.println("t1�����ȼ�:"+t1.getPriority());
		System.out.println("t2�����ȼ�:"+t2.getPriority());
		

		//��t1�������ȼ�
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("�ı�֮���t1�����ȼ�:"+t1.getPriority());
		
		//��t2���ó���͵����ȼ�
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("�ı�֮���t2�����ȼ�:"+t2.getPriority());
		
		t1.start();//����״̬
		t2.start();//����״̬
	}
}
