package day59;

public class Print {
/**
 * 
 * @param name	学生姓名
 * @param eScore 英语成绩
 * @param mScore 数学成绩
 * @param yScore 语文成绩
 */
	public void PrintScore(String name,int eScore,int mScore,int yScore){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"的英文成绩:"+eScore);
		System.out.println(name+"的数学成绩:"+mScore);
		System.out.println(name+"的语文成绩:"+yScore);
	}
}
