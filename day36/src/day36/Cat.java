package day36;

public class Cat extends Feline{

	/**
	 * è�Ĳ�ʳ����
	 * 
	 */
	@Override
	public void catchAnimal(Animal animal) {
		// TODO Auto-generated method stub
		//�����жϲ�ʳ�Ƿ�������
		if(animal instanceof Mouse){
			System.out.println("è���ڲ�ʳ����");
		}else{
			System.out.println("è���ܲ�ʳ��");
		}
	}

}
