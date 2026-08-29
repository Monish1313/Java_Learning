import java.util.*;

public class T48_ForEach {

    public static void main(String[] args) {

        // =====================================================
        // 1️⃣ forEach() with List
        // =====================================================
        // forEach() is a default method in Iterable interface
        // It internally loops through each element
        // It was introduced in Java 8

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Traditional enhanced for-loop
        for (String lang : languages) {
            System.out.println("Enhanced for-loop: " + lang);
        }

        // Using forEach() with lambda expression
        // 'lang' represents each element in the list
        languages.forEach(lang -> {
            System.out.println("forEach lambda: " + lang);
        });

        // Using method reference (shorter form)
        languages.forEach(System.out::println);

        // =====================================================
        // 2️⃣ forEach() with Set
        // =====================================================
        // Works same as List because Set also implements Iterable

        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.forEach(num -> {
            System.out.println("Set value: " + num);
        });

        // =====================================================
        // 3️⃣ forEach() with Map
        // =====================================================
        // Map does NOT implement Iterable
        // Map has its OWN forEach(BiConsumer) method

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // key and value are passed together
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // =====================================================
        // 4️⃣ Modifying values using forEach()
        // =====================================================
        // NOTE: You can modify OBJECT state, but not structure

        List<StringBuilder> builders = new ArrayList<>();
        builders.add(new StringBuilder("Hello"));
        builders.add(new StringBuilder("World"));

        builders.forEach(sb -> {
            sb.append(" Java");   // modifying object is allowed
        });

        System.out.println("Modified objects: " + builders);

        // =====================================================
        // 5️⃣ forEach() vs Iterator (Important)
        // =====================================================
        // forEach() does NOT allow structural modification
        // This will throw ConcurrentModificationException

        /*
        languages.forEach(lang -> {
            if (lang.equals("Python")) {
                languages.remove(lang);  // ❌ Runtime exception
            }
        });
        */

        // Correct way using Iterator
        Iterator<String> itr = languages.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals("Python")) {
                itr.remove();   // ✅ Safe removal
            }
        }

        System.out.println("After safe removal: " + languages);

        // =====================================================
        // 6️⃣ When to use forEach()
        // =====================================================
        // ✔ When code readability matters
        // ✔ When no index is required
        // ✔ When no removal is needed
        // ❌ Not suitable when modifying collection structure
    }
}
