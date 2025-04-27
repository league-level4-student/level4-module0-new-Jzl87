package _04_Snake;

public class Location {
	private int x;
	private int y;
	public Location ( int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public void setX (int newX) {
		x = newX;
	}
	
	public int getX () {
		return x;
	}
	
	public void setY (int newY) {
		y = newY;
	}
	
	public int getY () {
		return y;
	}
	
	public boolean equals (Location loc) {
		if (loc.getX() == x && loc.getY() == y) {
			return true;
		} else {
			return false;
		}
	}
}
