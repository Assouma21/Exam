import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> country = new LinkedList<String>();

        country.add("Algeria");
        country.add("USA");
        country.add("Canada");
        country.add("Pakistan");
        country.add("Tunisia");

        System.out.println(country);

        // remove element from linkedlist by index:
        System.out.println("remove element from linkedlist : ");
        country.remove(4);
        System.out.println(country);

    }
}
