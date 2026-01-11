
public class AccessClass {
    public static void main(String args[]) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.eid=101;
        emp1.ename="Abhishek Kumar";
        emp1.ejob="Java Developer";
        emp1.esal=50000;
        
        emp2.eid=102;
        emp2.ename="Hitesh Kumar";
        emp2.ejob="IOT Developer";
        emp2.esal=54000;

        emp1.display();
        emp2.display();
    }
}