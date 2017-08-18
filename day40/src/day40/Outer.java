package day40;

public class Outer {

		private String out_string="out_string";
	
		class Inner{
			public void print(){
				System.out.println(out_string);
			}
		}
}
