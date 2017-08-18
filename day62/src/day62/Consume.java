package day62;

import java.util.List;

public class Consume extends Thread{

		//定义仓库属性
		private List<Integer> list;
		//定义仓库容量
		private int max;
		
		/**
		 * 重写构造方法
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
			
			//消费者一直在消费，所以用while循环
			while(true){
				
				//锁仓库
				synchronized (list) {
					
					//判断仓库是否为空
					while(list.isEmpty()){
						System.out.println("仓库已空");
						try {
							list.wait();//线程挂起
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					//消费
					System.out.println(this.getName()+"正在消费"+list.get(list.size()-1));
					list.remove(list.size()-1);
					list.notifyAll();
				}
				}
		}
}
