public class Account_ext {

    private String id;
    private String name;
    private int balance;

    public Account_ext(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setId(String newId){
        this.id = newId;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

    @Override
    public String toString(){
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }
}
