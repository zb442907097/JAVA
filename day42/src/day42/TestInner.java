package day42;

public class TestInner {

}


class Outer{
	
	private String name;
	
	/**
	 * �ھֲ��ڲ���������Է����ⲿ������г�Ա����
	 * �ֲ��ڲ�����ʷ����еľֲ�������ʱ�򣬸þֲ�������������Ϊfinal����
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