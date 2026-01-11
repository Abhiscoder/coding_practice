public class AccessGreetings {
    public static void main(String args[]) {
        Greetings gm = new Greetings();

        gm.m1();
        System.out.println(gm.m2());
        gm.m3("Abhishek");
        System.out.println(gm.m4("Developer"));
    }
}