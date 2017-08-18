package day59;

public class MyThread implements Runnable{
	
	String name;
	Source s;
	
	MyThread(String name,Source s){
		this.name=name;
		this.s=s;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Source getS() {
		return s;
	}

	public void setS(Source s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if("method1".equals(name)){
			s.method1();
		}else{
			s.method2();
		}
	}
	public static void main(String[] args) {
		
		Source s=new Source();
		MyThread mt=new MyThread("method1", s);
		MyThread  mt1=new MyThread("method2", s);
		
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt1);
		
		
		t1.start();
		t2.start();
	}
}
