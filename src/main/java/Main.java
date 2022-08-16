public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account("1", "Johnson", 300);

        System.out.println(myAccount);

        int myBalance = myAccount.getBalance();
        System.out.println(myBalance);
    }
}
