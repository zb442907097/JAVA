package day41;

public class TestInner {

		public static void main(String[] args) {
				OuterI outer = new OuterI(){

					@Override
					public void show(){
						
						// TODO Auto-generated method stub
						System.out.println("�����������show����");
					}
					
				};
			}
}
interface OuterI{
	
	public void show();
}
