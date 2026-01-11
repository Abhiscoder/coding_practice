public class Greetings {
    void m1() {
        System.out.println("No Params not return value");
    }

    String m2() {
        return "No params but retrun value";
    }

    void m3(String name) {
        System.out.println("Take params but not retrun value: " + name);
    }

    String m4(String job) {
        return ("Take params and retrun value: " + job);
    }
}