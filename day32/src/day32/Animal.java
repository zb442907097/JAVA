package day32;

/*
 * 父类Animal
 */
public class Animal {

		private String type;//类别
		private String skin;//肤色
		private int legCount;//几条腿
		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSkin() {
			return skin;
		}

		public void setSkin(String skin) {
			this.skin = skin;
		}

		public int getLegCount() {
			return legCount;
		}

		public void setLegCount(int legCount) {
			this.legCount = legCount;
		}

				
		//吃东西
		public void eat(){
			System.out.println("动物在吃东西");
		}
		
		//呼吸
		public void huxi(){
			System.out.println("动物在呼吸");
		}
}

