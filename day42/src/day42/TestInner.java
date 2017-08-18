package day42;

public class TestInner {

}


class Outer{
	
	private String name;
	
	/**
	 * 在局部内部类里面可以访问外部类的所有成员变量
	 * 局部内部类访问方法中的局部变量的时候，该局部变量必须声明为final类型
	 * @param i
	 */
	
	public void eat(final int i){
		
		final int count=0;
		
		class Inner{
			
			public void innerEat(){
				System.out.println(name);
				System.out.println(i);
				System.out.println(count);
			}
		}
	}
}