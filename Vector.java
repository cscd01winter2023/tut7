import java.lang.Math;

public class Vector {

  private double x;
  private double y;

  public Vector(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void add(Vector v){
    this.x += v.getX();
    this.y += v.getY();
  }

  public double getMagnitude(){
    return Math.sqrt(this.x * this.x+ this.y * this.y);
  }
}
