package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

//���Զ�ά����
public class TestArray {

		public static void main(String[] args) {
		/*	print(8);
			printSan(20);
			int nDisks =4;
			doToWers(nDisks,'A','B','C');*/
			printSiBian(10);
			/*
			 * int a[][]= {{1,2},{3,4,5,6},{7,8,9}};
			
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					System.out.print("a["+i+"]["+j+"]= "+a[i][j]+" ");
				}
				System.out.println();
			}*/
			Calendar calendar =Calendar.getInstance();
			System.out.println(calendar.getTime());
			reverseArray();
		}
		/**
		 * ������������鷴ת����
		 */
		public static void reverseArray(){
		ArrayList<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println("��תǰ����:"+list);
		Collections.reverse(list);
		System.out.println("��ת������:"+list);
		for(String arrList : list){
			System.out.print(arrList);
		}
		
	}
		/**
		 * ��ŵ�����ֳƺ�������������Դ��ӡ��һ�����ϴ�˵��������ߡ������촴�������ʱ�������������ʯ���ӣ���һ�������ϴ������ϰ��մ�С˳������64Ƭ�ƽ�Բ�̡�
		 * ���������������Ű�Բ�̴����濪ʼ����С˳�����°ڷ�����һ�������ϡ����ҹ涨����СԲ���ϲ��ܷŴ�Բ�̣�����������֮��һ��ֻ���ƶ�һ��Բ�̡�
			�����������˵���ݱ�Ϊ��ŵ����Ϸ
		 * 
		 * @param topN ���ӵ�����
		 * @param from ��һ������
		 * @param inter �ڶ�������
		 * @param to 	����������
		 */
		public static void doToWers(int topN,char from ,char inter,char to ){
			if(topN ==1){
				System.out.println("Disk 1 from "+from +" to "+to);
			}else{
				doToWers(topN-1, from, to, inter);
					System.out.println("Disk "+topN+" from "+from +" to "+to );
					doToWers(topN-1, inter, from, to);
				
			}
		}
		/**
		 * ��ӡ����
		 */
		public static void print(int size){
			if(size % 2 ==0){
				size ++;//�������δ�С
			}
			for(int i=0;i<size/2+1;i++){
				
				for(int j=size/2+1;j>i+1;j--){
					System.out.print(" ");//������Ͻ�λ�õĿհ�
				}
				for(int j=0;j<2*i+1;j++){
					System.out.print("*");//��������ϰ벿��Ե
				}
				System.out.println();
			}
			for(int i=size/2+1;i<size;i++){
				for(int j=0;j<i-size/2;j++){
					System.out.print(" ");//����������½�λ�õĿհ�
				}
				for(int j=0;j<2*size -1-2*i;j++){
					System.out.print("*");//��������°벿��Ե
				}
				System.out.println();
			}
		}
		
		/**
		 * ��ӡ������
		 */
		public static void printSan(int size){
			for(int i=1;i<=size;i++){
				for(int j=size;j>=i;j--){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				for(int j=1;j<i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		for(int i=1;i<=size;i++){
			for(int n=1;n<=i;n++){
				System.out.print(" ");
			}
			for(int l=size;l>i;l--){
				System.out.print("*");
			}
			for(int x=size;x>=i;x--){
				System.out.print("*");
			}
			System.out.println();
		}
		}
		public static void printSiBian(int size){
		/**
		 * ��ӡƽ���ı���
		 * 
		 */
		for(int i=1;i<=size;i++){
			for(int j=size;j>i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<i;j++ ){
				System.out.print("*");
			}
			for(int j=size;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
