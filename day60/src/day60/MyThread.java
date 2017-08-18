package day60;


public class MyThread extends Thread{
	
		Resource r1;
		Resource r2;
		
		MyThread(Resource r1,Resource r2,String name){
			super(name);
			this.r1=r1;
			this.r2=r2;
		}
		public void run(){
			synchronized (r1) {
				System.out.println(this.getName()+"�����"+r1.resourceName);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(this.getName()+"�ڵȴ�"+r2.resourceName);
			synchronized (r2) {
				System.out.println(this.getName()+"�����"+r2.resourceName);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
