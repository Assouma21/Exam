import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<Integer>();
        nums.add(20);
        nums.add(100);
        nums.add(2);
        nums.add(50);
        nums.add(30);

        System.out.println(nums);
        // check if given element excite in treeset:
        System.out.println("check if element exicite in TreeSet :");
        System.out.println(nums.contains(2));
        System.out.println(nums.contains(40));
    }
}
