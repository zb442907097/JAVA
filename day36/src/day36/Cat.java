package day36;

public class Cat extends Feline{

	/**
	 * 猫的捕食方法
	 * 
	 */
	@Override
	public void catchAnimal(Animal animal) {
		// TODO Auto-generated method stub
		//首先判断捕食是否是老鼠
		if(animal instanceof Mouse){
			System.out.println("猫正在捕食老鼠");
		}else{
			System.out.println("猫不能捕食它");
		}
	}

}
