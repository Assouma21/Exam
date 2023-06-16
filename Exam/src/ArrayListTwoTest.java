import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTwoTest {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(60);
        nums.add(2);
        nums.add(30);
        nums.add(100);
        nums.add(50);
        nums.add(1);
        nums.add(7);
       // print arraylist:
        System.out.println(nums);

        // print ascending order of arralist:
        System.out.println("ascending order :");
        Collections.sort(nums);
        System.out.println(nums);



    }
}
