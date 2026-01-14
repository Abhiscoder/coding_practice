import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListDemo{
    public static void main(String args[]){
        //Decelaration of ArrayList
        // 1. ArrayList <arraylistname>= new ArrayList();
        // 2. List <listname> = new ArrayList();

        ArrayList <Object> mylist = new ArrayList<>();
        // adding data into arraylist
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);


        //Size of ArrayList - .size()
        System.out.println("size:"+mylist.size());

        // Print ArrayList
        System.out.println("Print Data:"+mylist);

        //Remove element from arraylist - remove(<indexnumber>)
        System.out.println("remove:"+mylist.remove(5));

        //Insert element in the arraylist -- add(<indexnumeber>, <value>)
        mylist.add(2, "JAVA");
        System.out.println("Print Data after insert: "+mylist);

        // Modify element in arraylist -- set(<indexnumber,<value>)
        System.out.println("Modify element:"+mylist.set(3,"Python"));

        // Access Specific element
        System.out.println("Access specific element:"+mylist.get(3));

        // Reading all the elements from Arraylist 

        // 1. using normal for loop
        for(int i=0; i<mylist.size();i++){

        System.out.println("Reading element using for loop: "+mylist.get(i));
        }

        // 2. Using for..each loop
        for(Object x:mylist){

        System.out.println("Reading element using for..each: "+x);
        }

        // 3. Using Iterator
         Iterator it = mylist.iterator();
        while(it.hasNext()){

        System.out.println("Reading element using Itreator: "+it.next());
        }

        //Checking arraylist is empty or not
        System.out.println("arraylist is empty or not: "+mylist.isEmpty());


    }

}