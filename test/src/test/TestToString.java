package test;

public class TestToString {
	
		public static void main(String[] args) {
		Dog d = new Dog(1,2,3);
		System.out.println(d.color);
}
}
class Dog{
	
	int color;
	int height,weight;
	
	public Dog(int i, int j, int k) {
		color =i;
		height =j;
		weight =k;
	}

}
