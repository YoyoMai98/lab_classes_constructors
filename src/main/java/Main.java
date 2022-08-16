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

        Customer myCustomer = new Customer(1, "John", "Doe", 300.24);

        System.out.println("id: " + myCustomer.getId());
        System.out.println("first name: " + myCustomer.getFirstName());
        System.out.println("last name: " + myCustomer.getLastName());
        System.out.println("held money: " + myCustomer.getHeldMoney());

        myCustomer.setHeldMoney(2000);
        System.out.println("new held money: " + myCustomer.getHeldMoney());

        System.out.println("full name: " + myCustomer.getFullName());

        myCustomer.subtractHeldMoney(180);
        System.out.println("subtract money held: " + myCustomer.getHeldMoney());
    }
}
