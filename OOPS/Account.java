//Example of Encapsulation

public class Account {
    private int accno;
    private String name;
    private double amount;

    void SetAccno(int accno) {
        this.accno = accno;
    }

    int getAccno() {
        return accno;
    }
}