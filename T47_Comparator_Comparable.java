import java.util.*;

// =======================================
// Student class implementing Comparable
// =======================================
class Student implements Comparable<Student> {

    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Comparable implementation
    // Default (natural) sorting by AGE
    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }

    // Used for printing object values
    @Override
    public String toString() {
        return id + "  " + name + "  " + age;
    }
}

// =======================================
// Comparator to sort by NAME
// =======================================
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// =======================================
// Comparator to sort by ID
// =======================================
class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
}

// =======================================
// Main Class
// =======================================
public class T47_Comparator_Comparable {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Monish", 25));
        students.add(new Student(1, "Arun", 21));
        students.add(new Student(2, "Raj", 23));

        // =======================================
        // Comparable sorting (by age)
        // =======================================
        Collections.sort(students);
        System.out.println("Sorting using Comparable (by age):");
        for (Student s : students) {
            System.out.println(s);
        }

        // =======================================
        // Comparator sorting (by name)
        // =======================================
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorting using Comparator (by name):");
        for (Student s : students) {
            System.out.println(s);
        }

        // =======================================
        // Comparator sorting (by id)
        // =======================================
        Collections.sort(students, new IdComparator());
        System.out.println("\nSorting using Comparator (by id):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
