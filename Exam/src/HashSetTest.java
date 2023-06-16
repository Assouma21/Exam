import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(3);
        num.add(5);
        num.add(10);
        num.add(20);

        System.out.println(num);

        // using iterator:
        Iterator<Integer> iterate = num.iterator();
        System.out.println("Iterating over set");
        while (iterate.hasNext()){
            System.out.println(iterate.next() + " ,");
        }

        // convert Hashset to Arraylist :

        ArrayList<Integer> num2 = new ArrayList<>(num);
        System.out.println("numbers in Arraylist is " + num2);


        System.out.println("get index 2  is : " + num2.get(2));



    }
}
