package day61;

import java.util.Scanner;

public class Game {

		private Player player;
		
		/**
		 * ��ʼ�����
		 * @param player
		 */
		public Game(Player player){
			this.player =player;
		}
		
		
		/**
		 * ������ʼ��Ϸ�ķ���
		 */
		public void start(){
			
			System.out.println("��ʼ��Ϸ");
			System.out.println(player.getName()+"��������Ϸ,��ʼ����Ϊ:"+player.getScore());
			//��������
			Scanner sc=new Scanner(System.in);
			
			//ѭ����Ϸ
			while(true){
			System.out.println("�����������ʯͷ���� ����֮һ,�˳�������exit!");
			//��ȡ��ҵ�����
			String s1 =sc.next();
			if(!filter(s1)){
				System.out.println("������������������");
				continue;
			}
			
			if(s1.equals("exit")){
				break;
			}
			//�����������
			String[] arr=new String[]{"����","ʯͷ","��"};
			int count =(int)(Math.random()*3);
			String s2 =arr[count];
			
			System.out.println("������"+s1+",���Գ���"+s2);
			
			//��Һ͵��ԱȽ�
			int flag =rule(s1, s2);
			
			if(flag>0){
				System.out.println("��ϲ��Ӯ��,����10����");
				player.setScore(player.getScore()+10);
			}else if(flag<0){
				System.out.println("�Բ���������,�۳�10����");
				player.setScore(player.getScore()-10);
			}else{
				System.out.println("��ƽ��");
			}
			System.out.println("�����ڻ���"+player.getScore());
			}
			System.out.println(player.getName()+"�˳�����Ϸ,��ǰ����Ϊ"+player.getScore());
			
		}
		

		
		/**
		 * ������ҵ�����
		 * @param s1��ҵ�����
		 * @return
		 */
		public boolean filter(String s1){
			if(s1.equals("����")||s1.equals("ʯͷ")||s1.equals("��")||s1.equals("exit")){
				return true;
			}else{
				return false;
			}
		}
		
		/**
		 * 
		 * @param s1 ���
		 * @param s2 ����
		 * @return
		 */
		public int rule(String s1,String s2){
			
			if(s1.equals(s2)){
				return 0;
			}
			if(s1.equals("����")){
				if(s2.equals("ʯͷ")){
					return -1;
				}
				if(s2.equals("��")){
					return 1;
				}
			}
			if(s1.equals("ʯͷ")){
				if(s2.equals("����")){
					return 1;
				}
				if(s2.equals("��")){
					return -1;
				}
			}
			if(s1.equals("��")){
				if(s2.equals("����")){
					return -1;
					}
				}
				if(s2.equals("ʯͷ")){
					return 1;
				}
				return 0;
		}
}
