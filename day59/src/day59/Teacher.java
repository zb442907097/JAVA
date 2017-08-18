package day59;

public class Teacher implements Runnable{

	private Print p;
	private String name;
	private int eScore,mScore,yScore;
	
	public Teacher(Print p,String name,int eScore,int mScore,int yScore){
		this.p=p;
		this.name=name;
		this.eScore=eScore;
		this.mScore=mScore;
		this.yScore=yScore;
				
	}
	public Print getP() {
		return p;
	}
	public void setP(Print p) {
		this.p = p;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int geteScore() {
		return eScore;
	}
	public void seteScore(int eScore) {
		this.eScore = eScore;
	}
	public int getmScore() {
		return mScore;
	}
	public void setmScore(int mScore) {
		this.mScore = mScore;
	}
	public int getyScore() {
		return yScore;
	}
	public void setyScore(int yScore) {
		this.yScore = yScore;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (p) {
			//锁定打印机对象，让它单线程运行
			p.PrintScore(name, eScore, mScore, yScore);
		}
	}
}
