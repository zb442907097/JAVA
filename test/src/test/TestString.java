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
		 * �Ƚ��ַ�����С
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
		 * �����ַ������һ�γ��ֵ�λ��
		 */
		public void selectString(){
			String str = "Hello World ,Hello Java!";
			int lastIndex = str.lastIndexOf("Java");
			if(lastIndex == -1){
				System.out.println("û���ҵ��ַ��� Java");
			}else{
				System.out.println("�ַ���Java������:"+lastIndex);
			}
		}
}
