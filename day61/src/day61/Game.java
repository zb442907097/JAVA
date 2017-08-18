package day61;

import java.util.Scanner;

public class Game {

		private Player player;
		
		/**
		 * 初始化玩家
		 * @param player
		 */
		public Game(Player player){
			this.player =player;
		}
		
		
		/**
		 * 声明开始游戏的方法
		 */
		public void start(){
			
			System.out.println("开始游戏");
			System.out.println(player.getName()+"进入了游戏,初始积分为:"+player.getScore());
			//定义输入
			Scanner sc=new Scanner(System.in);
			
			//循环游戏
			while(true){
			System.out.println("请输入剪刀，石头，布 其中之一,退出请输入exit!");
			//获取玩家的输入
			String s1 =sc.next();
			if(!filter(s1)){
				System.out.println("输入有误，请重新输入");
				continue;
			}
			
			if(s1.equals("exit")){
				break;
			}
			//定义电脑输入
			String[] arr=new String[]{"剪刀","石头","布"};
			int count =(int)(Math.random()*3);
			String s2 =arr[count];
			
			System.out.println("您出的"+s1+",电脑出的"+s2);
			
			//玩家和电脑比较
			int flag =rule(s1, s2);
			
			if(flag>0){
				System.out.println("恭喜您赢了,奖励10积分");
				player.setScore(player.getScore()+10);
			}else if(flag<0){
				System.out.println("对不了您输了,扣除10积分");
				player.setScore(player.getScore()-10);
			}else{
				System.out.println("打平了");
			}
			System.out.println("您现在还有"+player.getScore());
			}
			System.out.println(player.getName()+"退出了游戏,当前积分为"+player.getScore());
			
		}
		

		
		/**
		 * 过滤玩家的输入
		 * @param s1玩家的输入
		 * @return
		 */
		public boolean filter(String s1){
			if(s1.equals("剪刀")||s1.equals("石头")||s1.equals("布")||s1.equals("exit")){
				return true;
			}else{
				return false;
			}
		}
		
		/**
		 * 
		 * @param s1 玩家
		 * @param s2 电脑
		 * @return
		 */
		public int rule(String s1,String s2){
			
			if(s1.equals(s2)){
				return 0;
			}
			if(s1.equals("剪刀")){
				if(s2.equals("石头")){
					return -1;
				}
				if(s2.equals("布")){
					return 1;
				}
			}
			if(s1.equals("石头")){
				if(s2.equals("剪刀")){
					return 1;
				}
				if(s2.equals("布")){
					return -1;
				}
			}
			if(s1.equals("布")){
				if(s2.equals("剪刀")){
					return -1;
					}
				}
				if(s2.equals("石头")){
					return 1;
				}
				return 0;
		}
}
