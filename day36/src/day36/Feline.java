package day36;

//猫科动物类
public abstract class Feline {

		private int legCount =4;//腿的数量
		private String headShape ="round";//脑袋的形状
		private boolean meatEater =true;//是否是食肉动物
		
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
		 * 动物叫喊
		 */
		public void cry(){
			System.out.println("动物在叫喊");
		}
		
		/**
		 *  抽象方法捕食
		 */
		public abstract void catchAnimal(Animal animal);
}
