import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskList1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            myList.add(random.nextInt());
        }
        System.out.println(myList);
        myList.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(myList);
        myList.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(myList);
    }
}
