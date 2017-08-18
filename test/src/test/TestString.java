package test;

public class TestString {

		public static void main(String[] args){
		
		/*	//String str="helloworld";
			//str =str.substring(3,6);
			//System.out.println(str);
			
			String str1 ="hello";
			String str2 ="hello";
			String str3 ="hello"+"world";
			System.out.println(str1.equals(str2));*/
			TestString ts = new TestString();
			ts.selectString();
		
	}
		/**
		 * 比较字符串大小
		 */
		public void compareString(){
			String str1 ="Hello World!";
			String str2 ="hello world";
			Object objectStr =str1;
			
			System.out.println(str1.compareTo(str2));
			System.out.println(str1.compareToIgnoreCase(str2));
			System.out.println(str1.compareTo(objectStr.toString()));
		}
		
		/**
		 * 查找字符串最后一次出现的位置
		 */
		public void selectString(){
			String str = "Hello World ,Hello Java!";
			int lastIndex = str.lastIndexOf("Java");
			if(lastIndex == -1){
				System.out.println("没有找到字符串 Java");
			}else{
				System.out.println("字符串Java出现在:"+lastIndex);
			}
		}
}
