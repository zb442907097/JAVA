package day58;

public class Test {

	public static void main(String[] args) {
		
		Print p=new Print();
		Teacher t1=new Teacher(p,"������",10,11,12);
		Teacher t2=new Teacher(p,"������",23,31,2);
		Teacher t3=new Teacher(p,"�ձ���",34,44,89);
		
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		Thread th3=new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
