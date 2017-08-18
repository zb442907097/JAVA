package day62;

import java.util.List;

/**
 * 生产者
 * @author Administrator
 *
 */
		
public class Producer extends Thread{

		//定义仓库属性
		private List<Integer> list;
		//定义仓库容量
		private int max;
		
		/**
		 * 重写构造方法，传递3个参数
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
		 * 重写run()方法
		 */
		public void run(){
			
			while(true){
				
				//锁仓库
				synchronized (list) {
					
					while(list.size()==max){
						System.out.println("仓库已满");
						try {
							list.wait();// 线程挂起
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					int num=(int)(Math.random()*100)+1;
					list.add(num);
					System.out.println(this.getName()+"生产了"+num);
					//唤醒所有的线程
					list.notifyAll();
				}
			}
		}
}
