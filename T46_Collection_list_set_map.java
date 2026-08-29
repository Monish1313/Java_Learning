import java.util.*;

public class T46_Collection_list_set_map {

    public static void main(String[] args) {

        // =================================================
        // 1️⃣ LIST (ArrayList) – Most Used Methods
        // =================================================
        List<String> list = new ArrayList<>();

        list.add("Java");          // add element
        list.add("Python");
        list.add("C++");
        list.add("Java");          // allows duplicate

        list.add(1, "Spring");     // add at index

        System.out.println("List: " + list);

        list.remove("C++");        // remove by value
        list.remove(0);            // remove by index

        System.out.println("After remove: " + list);

        System.out.println("Get element at index 1: " + list.get(1));

        System.out.println("List size: " + list.size());  // number of elements

        System.out.println("Contains Java? " + list.contains("Java"));

        list.set(1, "Hibernate");  // replace element at index

        System.out.println("After set: " + list);

        // =================================================
        // 2️⃣ SET (HashSet) – Most Used Methods
        // =================================================
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);   // duplicate ignored

        System.out.println("\nSet: " + set);

        set.remove(20);            // remove element

        System.out.println("After remove: " + set);

        System.out.println("Set contains 30? " + set.contains(30));

        System.out.println("Set size: " + set.size());

        // =================================================
        // 3️⃣ MAP (HashMap) – Most Used Methods
        // =================================================
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");        // add key-value pair
        map.put(2, "Python");
        map.put(3, "C++");

        map.put(2, "Spring");      // overwrite value for key 2

        System.out.println("\nMap: " + map);

        System.out.println("Get value for key 1: " + map.get(1));

        map.remove(3);             // remove by key

        System.out.println("After remove: " + map);

        System.out.println("Map contains key 2? " + map.containsKey(2));
        System.out.println("Map contains value Java? " + map.containsValue("Java"));

        System.out.println("Map size: " + map.size());

        // =================================================
        // 4️⃣ Traversing Collections
        // =================================================

        // Enhanced for-loop (Most common)
        System.out.println("\nTraversing List:");
        for (String item : list) {
            System.out.println(item);
        }

        // Iterator (safe removal while iterating)
        System.out.println("\nTraversing Set using Iterator:");
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Traversing Map
        System.out.println("\nTraversing Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // =================================================
        // 5️⃣ Utility Methods from Collections class
        // =================================================
        Collections.sort(list);          // sort list
        Collections.reverse(list);       // reverse list
        Collections.shuffle(list);       // random order

        System.out.println("\nAfter sort/reverse/shuffle: " + list);

        System.out.println("Max element: " + Collections.max(list));
        System.out.println("Min element: " + Collections.min(list));
    }
}
