package day62;

import java.util.List;

public class Consume extends Thread{

		//����ֿ�����
		private List<Integer> list;
		//����ֿ�����
		private int max;
		
		/**
		 * ��д���췽��
		 * @param name
		 * @param max
		 * @param list
		 */
		public  Consume(String name,int max,List<Integer> list){
			super(name);
			this.max=max;
			this.list=list;
		}
		
		public void run(){
			
			//������һֱ�����ѣ�������whileѭ��
			while(true){
				
				//���ֿ�
				synchronized (list) {
					
					//�жϲֿ��Ƿ�Ϊ��
					while(list.isEmpty()){
						System.out.println("�ֿ��ѿ�");
						try {
							list.wait();//�̹߳���
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					//����
					System.out.println(this.getName()+"��������"+list.get(list.size()-1));
					list.remove(list.size()-1);
					list.notifyAll();
				}
				}
		}
}
