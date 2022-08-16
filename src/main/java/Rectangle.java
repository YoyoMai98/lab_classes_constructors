public class Rectangle {

    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getPerimeter(){
        return 2 * (this.length + this.width);
    }

    public float getArea(){
        return this.length * this.width;
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(this.length,2) + Math.pow(this.width,2));
    }

    public float getLength(){
        return this.length;
    }

    public float getWidth(){
        return this.width;
    }

    public void setLength(float newLength){
        this.length = newLength;
    }

    public void setWidth(float newWidth){
        this.width = newWidth;
    }
}
