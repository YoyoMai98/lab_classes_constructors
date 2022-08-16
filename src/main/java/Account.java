public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }
}
