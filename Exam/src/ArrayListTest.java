import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Appel");
        fruits.add("Banana");
        fruits.add("kiwi");
            System.out.println(fruits);

        System.out.println("Print second Arraylist");

        fruits.add(2,"pineapple");
        for (String fruit2:fruits
             ) {
            System.out.println(fruit2);
        }






    }




}
