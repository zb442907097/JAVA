package test;

public class TestFor {
		
		public static void main(String[] args){
		
			jiujiuchengfabiao();
			System.out.println();
			jiujiujiafabiao();
		}
		
		/**
		 * �žų˷���
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
		 * �žżӷ���
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
