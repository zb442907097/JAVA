package day39;

public class MTest implements Jia,Jian,Cheng,Chu{

	@Override
	public int chu(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int cheng(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int jian(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int jia(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
