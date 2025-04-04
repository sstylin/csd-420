
// Steve Stylin: Module 3: ArrayList And LinkedList
import java.util.ArrayList;
import java.util.LinkedList;

public class JavaList {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Winter");
        arrayList.add("Spring");
        arrayList.add("Summer");
        System.out.println("ArrayList of Seasons: " + arrayList);

        // Using LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dec - Jan");
        linkedList.add("March - May");
        linkedList.add("June - Aug");
        System.out.println("LinkedList for seasons Months: " + linkedList);
    }
}
