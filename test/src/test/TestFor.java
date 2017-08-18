package test;

public class TestFor {
		
		public static void main(String[] args){
		
			jiujiuchengfabiao();
			System.out.println();
			jiujiujiafabiao();
		}
		
		/**
		 * 九九乘法表
		 */
		public static void jiujiuchengfabiao(){
			int sum;
			for(int i=1;i<=9;i++){
			  for(int j=1;j<=i;j++){
				sum=i*j;
				System.out.print(j+"*"+i+"="+sum+"\t");
			  }
			  System.out.println();
			}
		}
		
		/**
		 * 九九加法表
		 */
		public static void jiujiujiafabiao(){
			int sum;
			for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					sum =i+j;
					System.out.print(j+"+"+i+"="+sum+"\t");
				}
				System.out.println();
			}
		}
}
