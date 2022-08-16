public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
}
