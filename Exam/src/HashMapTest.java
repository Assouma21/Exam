import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> ages = new HashMap<>();
        ages.put("Alma",12);
        ages.put("Olivia",6);
        ages.put("Steph",10);
        ages.put("abc",90);
        ages.put("bdf",40);

        System.out.println(ages);


        // get the size of Hashmap
        System.out.println("size of Hashmap is : " + ages.size());

    }
}
