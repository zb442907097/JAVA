package day60;

public class Test {

		public static void main(String[] args) {
			
			Resource r1=new Resource("��Դ1");
			Resource r2=new Resource("��Դ2");
			
			MyThread mt1=new MyThread(r1, r2, "�߳�1");
			MyThread mt2=new MyThread(r2, r1, "�߳�2");
			
			mt1.start();
			mt2.start();
		}
}
