package day59;

public class Source {

		synchronized void method1(){
			System.out.println("����method1�����������");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("method1ִ����ϣ��ͷ���");
		}
		
		
		synchronized void method2(){
			System.out.println("����method2�����������");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("method2ִ����ϣ��ͷ���");
		}
}
