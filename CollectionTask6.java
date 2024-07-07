//Convert Set of Strings to List of Strings:

import java.util.*;

public class CollectionTask6 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Convert Set to List
        List<String> list = new ArrayList<>(set);

        // Print List
        System.out.println("List after converting from Set:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
