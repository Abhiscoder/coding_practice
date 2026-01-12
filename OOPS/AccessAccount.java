public class AccessAccount {
    public static void main(String args[]) {
        Account acc = new Account();

        acc.SetAccno(101);
        System.out.println(acc.getAccno());
    }
}