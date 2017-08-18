package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

//测试二维数组
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
		 * 数组排序和数组反转排序
		 */
		public static void reverseArray(){
		ArrayList<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println("反转前排序:"+list);
		Collections.reverse(list);
		System.out.println("反转后排序:"+list);
		for(String arrList : list){
			System.out.print(arrList);
		}
		
	}
		/**
		 * 汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。
		 * 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。
			后来，这个传说就演变为汉诺塔游戏
		 * 
		 * @param topN 碟子的数量
		 * @param from 第一根柱子
		 * @param inter 第二根柱子
		 * @param to 	第三根柱子
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
		 * 打印菱形
		 */
		public static void print(int size){
			if(size % 2 ==0){
				size ++;//计算菱形大小
			}
			for(int i=0;i<size/2+1;i++){
				
				for(int j=size/2+1;j>i+1;j--){
					System.out.print(" ");//输出左上角位置的空白
				}
				for(int j=0;j<2*i+1;j++){
					System.out.print("*");//输出菱形上半部边缘
				}
				System.out.println();
			}
			for(int i=size/2+1;i<size;i++){
				for(int j=0;j<i-size/2;j++){
					System.out.print(" ");//输出菱形左下角位置的空白
				}
				for(int j=0;j<2*size -1-2*i;j++){
					System.out.print("*");//输出菱形下半部边缘
				}
				System.out.println();
			}
		}
		
		/**
		 * 打印三角形
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
		 * 打印平行四边形
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
