package day36;

//è�ƶ�����
public abstract class Feline {

		private int legCount =4;//�ȵ�����
		private String headShape ="round";//�Դ�����״
		private boolean meatEater =true;//�Ƿ���ʳ�⶯��
		
		public int getLegCount() {
			return legCount;
		}
		public void setLegCount(int legCount) {
			this.legCount = legCount;
		}
		public String getHeadShape() {
			return headShape;
		}
		public void setHeadShape(String headShape) {
			this.headShape = headShape;
		}
		public boolean isMeatEater() {
			return meatEater;
		}
		public void setMeatEater(boolean meatEater) {
			this.meatEater = meatEater;
		}
		/**
		 * ����к�
		 */
		public void cry(){
			System.out.println("�����ڽк�");
		}
		
		/**
		 *  ���󷽷���ʳ
		 */
		public abstract void catchAnimal(Animal animal);
}
