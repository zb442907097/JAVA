package test;

public class Point {

		double x,y,z;
		Point(double x,double y,double z){
			this.x=x;
			this.y=y;
			this.z=z;
		}
		
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		public double getZ() {
			return z;
		}
		public void setZ(double z) {
			this.z = z;
		}
		
		double getDistance(Point p){
			return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
		}
		public static void main(String[] args) {
			Point p1 = new Point(1.0,2.0,3.0);
			Point p2 =new Point(0.0,0.0,0.0);
			System.out.println(p1.getDistance(p2));
			p1.setX(5.0);
			System.out.println(p1.getDistance(new Point(1.0,1.0,1.0)));
		}
}
