package day33;

public class A {

		A(){
			System.out.println("����A�޲ι��췽��");
		}
		A(int i){
			System.out.println("����A���вι��췽��");
		}
class B extends A{
	B(){
		System.out.println("����B�޲ι��췽��");
	}
	B(int i){
		super(i);
		System.out.println("����B�вι��췽��");
	}
}
}
