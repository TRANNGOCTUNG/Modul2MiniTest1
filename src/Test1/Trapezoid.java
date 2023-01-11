package Test1;

public class Trapezoid {
   private double bigBottom;
   private double smallBottom;
   private  double leftEdge;
   private double rightSide;
   private double height;

    public Trapezoid(double bigBottom, double smallBottom, double leftEdge, double rightSide, double height) {
        this.bigBottom = bigBottom;
        this.smallBottom = smallBottom;
        this.leftEdge = leftEdge;
        this.rightSide = rightSide;
        this.height = height;
    }
    public double getPerimeter(){
        return  bigBottom + smallBottom + leftEdge + rightSide;
    }
    public double getArea(){
        return  (bigBottom + smallBottom) * height / 2;
    }

}
