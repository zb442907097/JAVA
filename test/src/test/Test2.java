package test;
import java.util.Scanner;

public class Test2 {
	
		public static void main(String[] args) {
			
			//ѧ���ɼ�����ϵͳ
			int student;//ѧ������
			double sum=0,avg=0;//�ܳɼ���ƽ���ɼ�
			double[] arr=new double[10];//ʵ�������飬���Ҷ������鳤��Ϊ10
			//����һ��Scanner��Ķ���������ȡ�û�������
			Scanner sc =new Scanner(System.in);
			System.out.println("������ǰ10���ĳɼ�:");
			for(student=0;student<arr.length;student++){
				//��ȡ�û�������
				arr[student] =sc.nextDouble();
				sum+=arr[student];
			}
				avg =sum/10;
				System.out.println("ѧ�����ܳɼ�Ϊ:"+sum);
				System.out.println("ѧ����ƽ���ɼ�Ϊ:"+avg);
				for(student=0;student<arr.length;student++){
				if(arr[student]<avg){
					System.out.println("��ѧ���ĳɼ�����ƽ��ֵ");
				}else if(arr[student]>avg){
					System.out.println("��ѧ���ĳɼ�����ƽ��ֵ");
				}else {
					System.out.println("��ѧ���ĳɼ�����ƽ��ֵ");
				}
			}
		}
}
