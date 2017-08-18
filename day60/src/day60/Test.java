package day60;

public class Test {

		public static void main(String[] args) {
			
			Resource r1=new Resource("资源1");
			Resource r2=new Resource("资源2");
			
			MyThread mt1=new MyThread(r1, r2, "线程1");
			MyThread mt2=new MyThread(r2, r1, "线程2");
			
			mt1.start();
			mt2.start();
		}
}
