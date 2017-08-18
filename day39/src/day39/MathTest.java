package day39;

public class MathTest {

		public static void main(String[] args) {
			MTest mt = new MTest();
			System.out.println("a+b="+mt.jia(13, 3));
		}
}
/**
 * ¼õ¼õ³Ë³ýµÄ½Ó¿Ú
 * @author Administrator
 *
 */
interface Jia{
	int jia(int a,int b);
}
interface Jian{
	int jian(int a,int b);
}
interface Cheng{
	int cheng(int a,int b);
}
interface Chu{
	int chu(int a,int b);
}