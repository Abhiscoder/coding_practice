public class AccessAdder {
    public static void main(String args[]) {
        Adder addobj = new Adder();

        addobj.sum();
        addobj.sum(100, 200);
        addobj.sum(10.5, 10);
        addobj.sum(10, 15.5);
        addobj.sum(100, 520, 80);
    }
}