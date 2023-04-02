import java.lang.Math;

public class Point{

  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  @Override
  public boolean equals(Object obj){
	if(obj == null || !(obj instanceof Point))
		return false;
	Point other = (Point)obj;
	return x==other.x && y==other.y;
  }
}
