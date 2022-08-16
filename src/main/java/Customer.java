public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    public Customer(String firstName, String lastName, double heldMoney){
        this.id = (int) (Math.random() * 1000) + 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.heldMoney = heldMoney;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void subtractHeldMoney(double money){
        setHeldMoney(this.heldMoney - money);
    }

    public void addHeldMoney(double addMoney){
        setHeldMoney(this.heldMoney + addMoney);
    }

    public int getId(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public double getHeldMoney(){
        return this.heldMoney;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public void setHeldMoney(double newHeldMoney){
        this.heldMoney = newHeldMoney;
    }

    @Override
    public String toString(){
        return "Customer{" + "id='" + id + '\'' + ", first name='" + firstName + '\'' +
                ", last name='" + lastName + '\'' + ", held Money=" + heldMoney + '}';
    }
}
