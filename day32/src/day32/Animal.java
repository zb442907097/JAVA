package day32;

/*
 * ����Animal
 */
public class Animal {

		private String type;//���
		private String skin;//��ɫ
		private int legCount;//������
		
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

				
		//�Զ���
		public void eat(){
			System.out.println("�����ڳԶ���");
		}
		
		//����
		public void huxi(){
			System.out.println("�����ں���");
		}
}

