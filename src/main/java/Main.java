public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account("1", "Johnson", 300);

        System.out.println(myAccount);

        int myBalance = myAccount.getBalance();
        System.out.println(myBalance);

        Circle myCircle = new Circle(2);

        System.out.println("radius: " + myCircle.getRadius());
        System.out.println("circumference: " + myCircle.getCircumference());

        myCircle.setRadius(4);
        System.out.println("new circumference: " + myCircle.getCircumference());

        Rectangle myRectangle = new Rectangle(13, 24);

        System.out.println("length: " + myRectangle.getLength());
        System.out.println("width: " + myRectangle.getWidth());

        myRectangle.setLength(10);
        System.out.println("new length: " + myRectangle.getLength());

        System.out.println("perimeter: " + myRectangle.getPerimeter());
        System.out.println("area: " + myRectangle.getArea());
        System.out.println("diagonal: " + myRectangle.getDiagonal());
    }
}
