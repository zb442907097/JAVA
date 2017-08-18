package day61;

public class Player {

		private String name;//玩家姓名
		private int score;//积分
		
		public Player(String name, int score) {
			super();
			this.name =name;
			this.score =score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String toString(){
			return this.getName()+":"+this.getScore();
			
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
}
