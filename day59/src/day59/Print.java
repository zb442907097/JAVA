package day59;

public class Print {
/**
 * 
 * @param name	ѧ������
 * @param eScore Ӣ��ɼ�
 * @param mScore ��ѧ�ɼ�
 * @param yScore ���ĳɼ�
 */
	public void PrintScore(String name,int eScore,int mScore,int yScore){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"��Ӣ�ĳɼ�:"+eScore);
		System.out.println(name+"����ѧ�ɼ�:"+mScore);
		System.out.println(name+"�����ĳɼ�:"+yScore);
	}
}
