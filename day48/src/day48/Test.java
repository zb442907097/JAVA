package day48;

/**
 * �쳣����
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		System.out.println("��������ʼִ��");
		Test t=new Test();
		t.test2();
//		try{
//			t.test1();
//		}catch(ArithmeticException e){
//			System.out.println(e);
//		}
		System.out.println("������ִ�����");
	}
	public void test1() throws ArithmeticException{
		
		System.out.println("test1()��ʼִ��");
		System.out.println(1/0);
		System.out.println("test1()ִ�����");
	}
	public void test2() throws ArithmeticException{
		try{
			test1();
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
