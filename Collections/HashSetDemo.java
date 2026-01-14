import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[]){
        //Declaration 
        // 1. HashSet myset = new HashSet();
        // 2. Set myset1 = new HashSet();
        // 3. HashSet <String> myset2 = new HashSet<String>();

        HashSet <Object> myset = new HashSet<>();

        //Add elements
        myset.add(100);
        myset.add(10.5);
        myset.add("Welcome");
        myset.add('A');
        myset.add(100);
        myset.add(true);
        myset.add(null);
        myset.add(null);


        //Print HashSet
        System.out.println(myset);


        //Remvoe Element from HashSet -----> remove(<value>)
        myset.remove(10.5);
        System.out.println(myset);

        //Inserting element --------> Not Possible 

        // Access Specific element ----------> Not Possible

        // Convert HashSet into ArraySet (this is a alternative method to inserting element and access element)
        ArrayList <Object> al = new ArrayList<>(myset);

        System.out.println(al);
        System.out.println(al.get(2));


        //Read all the element using for...each loop
        for(Object x:myset){
            System.out.println(x);
        }

        //Using Iterator

        Iterator <Object> it = myset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // Clearing all element
        myset.clear();

        System.out.println(myset.isEmpty());







    }

}
