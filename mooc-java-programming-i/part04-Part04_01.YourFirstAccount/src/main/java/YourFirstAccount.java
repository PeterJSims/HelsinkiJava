
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("Peter", 100.0);
        account.deposit(20.0);
        System.out.println(account);
    }
}
