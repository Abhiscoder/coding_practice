public class DataConversionMethods {
    public static void main(String args[]) {
        // Scenario 1 :- String ---> int, double, boolean, char

        // 1. String -> int
        /*
         * String s="Welcome"
         * int sint = Integer.parseInt(s);
         */ // Cannot convert into int

        String s1 = "15";
        int s1int = Integer.parseInt(s1);
        System.out.println(s1int);

        // 2. String -> double
        String d1 = "10.5";
        String d2 = "20.5";

        double d3 = Double.parseDouble(d1);
        double d4 = Double.parseDouble(d2);
        System.out.println(d3 + d4);

        // 3. String ->bool
        String c1 = "True";
        String c2 = "Welcome";
        System.out.println(Boolean.parseBoolean(c1)); // true
        System.out.println(Boolean.parseBoolean(c2));// flase (beacuse bool only return true when value is true
                                                     // otherwise flase.)

        // Scenario 2 :- int, double, boolean, char --->String

        int a = 10;
        double b= 10.5;
        char c ='A';
        boolean bool = true;

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(bool));


    }
}
