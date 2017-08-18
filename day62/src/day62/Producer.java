package day62;

import java.util.List;

/**
 * ������
 * @author Administrator
 *
 */
		
public class Producer extends Thread{

		//����ֿ�����
		private List<Integer> list;
		//����ֿ�����
		private int max;
		
		/**
		 * ��д���췽��������3������
		 * @param name
		 * @param max
		 * @param list
		 */
		public Producer(String name,int max,List<Integer> list){
			super(name);
			this.max=max;
			this.list=list;
		}
		
		/**
		 * ��дrun()����
		 */
		public void run(){
			
			while(true){
				
				//���ֿ�
				synchronized (list) {
					
					while(list.size()==max){
						System.out.println("�ֿ�����");
						try {
							list.wait();// �̹߳���
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					int num=(int)(Math.random()*100)+1;
					list.add(num);
					System.out.println(this.getName()+"������"+num);
					//�������е��߳�
					list.notifyAll();
				}
			}
		}
}
