package day48;

/**
 * 异常声明
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		System.out.println("主方法开始执行");
		Test t=new Test();
		t.test2();
//		try{
//			t.test1();
//		}catch(ArithmeticException e){
//			System.out.println(e);
//		}
		System.out.println("主方法执行完毕");
	}
	public void test1() throws ArithmeticException{
		
		System.out.println("test1()开始执行");
		System.out.println(1/0);
		System.out.println("test1()执行完毕");
	}
	public void test2() throws ArithmeticException{
		try{
			test1();
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
