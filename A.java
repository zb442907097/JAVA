package day33;

public class A {

		A(){
			System.out.println("调用A无参构造方法");
		}
		A(int i){
			System.out.println("调用A的有参构造方法");
		}
class B extends A{
	B(){
		System.out.println("调用B无参构造方法");
	}
	B(int i){
		super(i);
		System.out.println("调用B有参构造方法");
	}
}
}
