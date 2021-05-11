package Springbasics;

public class Size {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


public void display1() {
	// TODO Auto-generated method stub
	 
	   System.out.println("point a"+getPointA().getX()+ " " +getPointA().getY());

	   System.out.println("point a"+getPointB().getX()+ " " +getPointB().getY());

	   System.out.println("point a"+getPointB().getX()+ " " +getPointB().getY());
	
}

	
	

}
