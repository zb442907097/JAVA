package test;
import java.util.Scanner;

public class Test2 {
	
		public static void main(String[] args) {
			
			//学生成绩管理系统
			int student;//学生人数
			double sum=0,avg=0;//总成绩和平均成绩
			double[] arr=new double[10];//实例化数组，并且定义数组长度为10
			//创建一个Scanner类的对象，用来获取用户的输入
			Scanner sc =new Scanner(System.in);
			System.out.println("请输入前10名的成绩:");
			for(student=0;student<arr.length;student++){
				//读取用户的输入
				arr[student] =sc.nextDouble();
				sum+=arr[student];
			}
				avg =sum/10;
				System.out.println("学生的总成绩为:"+sum);
				System.out.println("学生的平均成绩为:"+avg);
				for(student=0;student<arr.length;student++){
				if(arr[student]<avg){
					System.out.println("该学生的成绩低于平均值");
				}else if(arr[student]>avg){
					System.out.println("该学生的成绩高于平均值");
				}else {
					System.out.println("该学生的成绩等于平均值");
				}
			}
		}
}
