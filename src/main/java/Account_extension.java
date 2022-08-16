public class Account_extension {

    private String id;
    private Customer owner;
    private int balance;

    public Account_extension(String id, Customer owner, int balance){
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getId(){
        return this.id;
    }

    public Customer getOwner(){
        return this.owner;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setId(String newId){
        this.id = newId;
    }

    public void setOwner(Customer newOwner){
        this.owner = newOwner;
    }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

    @Override
    public String toString(){
        return "Account{" + "id='" + id + ", name='" + owner + ", balance=" + balance + '}';
    }
}
