package day62;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
	
		//定义仓库数组
		List<Integer> list=new ArrayList<Integer>();
		//定义仓库的容量
		int max=100;
		
		Producer p=new Producer("生产者", max, list);
		Consume s=new Consume("消费者", max, list);
		
		p.start();
		s.start();
	}		
}
