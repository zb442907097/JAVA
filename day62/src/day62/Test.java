package day62;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
	
		//����ֿ�����
		List<Integer> list=new ArrayList<Integer>();
		//����ֿ������
		int max=100;
		
		Producer p=new Producer("������", max, list);
		Consume s=new Consume("������", max, list);
		
		p.start();
		s.start();
	}		
}
