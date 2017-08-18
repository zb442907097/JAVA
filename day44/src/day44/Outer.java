package day44;

public class Outer {

		private int count=1;
		class Inner{
			
			private int count=2;
			
			public void print(int count){
				
				System.out.println(count);
				System.out.println(this.count);
				System.out.println(Outer.this.count);
			}
		}
		public static void main(String[] args) {
			Outer o= new Outer();
			Outer.Inner i= o.new Inner();
			i.print(3);
		}
}
