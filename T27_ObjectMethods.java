// T28_ObjectMethods.java

// ======================
// STUDENT CLASS
// ======================
class Student {

    int id;
    int marks;

    Student(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    // ---------------------------------------------------
    // toString()
    // ---------------------------------------------------
    // Default Object class toString() prints:
    //     ClassName@HexaHashcode  (Example: Student@7a81197d)
    //
    // That output is NOT meaningful.
    //
    // By overriding toString(), we can print the object data
    // clearly in human-readable format.
    //
    // We PREFER this because it:
    //  ✔ Helps debugging
    //  ✔ Helps logging
    //  ✔ Provides meaningful output
    // ---------------------------------------------------
    public String toString() {
        return "Student[id=" + id + ", marks=" + marks + "]";
    }


    // ---------------------------------------------------
    // equals() → compare object values
    // ---------------------------------------------------
    // Default equals() in Object class behaves like '=='
    // → compares memory addresses, not USER DATA.
    //
    // So:
    //     new Student(1,90).equals(new Student(1,90)) = false
    //
    // That is WRONG for real-world apps.
    //
    // We override equals() so that:
    //  ✔ Two objects with same "id" and "marks" are considered equal.
    //  ✔ Comparison is based on CONTENT (values), not memory.
    //
    // We PREFER overriding equals() because:
    //  ✔ Real objects must be compared by data (not memory)
    //  ✔ Needed for eliminating duplicates
    //  ✔ Needed in collections like HashSet, HashMap
    // ---------------------------------------------------
    public boolean equals(Object obj) {

        // If both references point to same object → return true
        if (this == obj)
            return true;

        // If obj is not a Student object → cannot compare → false
        if (!(obj instanceof Student))
            return false;

        // Convert Object type to Student type
        Student s = (Student) obj;

        // Compare meaningful values
        return this.id == s.id && this.marks == s.marks;
    }


    // ---------------------------------------------------
    // hashCode()
    // ---------------------------------------------------
    // Default hashCode() in Object class returns memory based hash.
    //
    // RULE:
    //     If equals() returns true,
    //     BOTH objects MUST have same hashCode().
    //
    // Why? Because HashMap, HashSet, Hashtable
    // use hashCode() to group objects.
    //
    // If equals() is overridden but hashCode() is NOT overridden,
    // collections will behave incorrectly (duplicates allowed).
    //
    // We PREFER overriding hashCode() because:
    //   ✔ Ensures compatibility with equals()
    //   ✔ Makes HashSet / HashMap work correctly
    // ---------------------------------------------------
    public int hashCode() {
        // Simple hash formula: combine values
        return id + marks;
    }
}



// ======================
// MAIN CLASS
// ======================
public class T27_ObjectMethods {

    public static void main(String[] args) {

        Student s1 = new Student(1, 90);
        Student s2 = new Student(1, 90);
        Student s3 = new Student(2, 80);

        // ---------------------------------------------------
        // toString() demonstration
        // ---------------------------------------------------
        System.out.println("Printing objects using toString():");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-----------------------------------");

        // ---------------------------------------------------
        // equals() demonstration
        // ---------------------------------------------------
        System.out.println("s1 equals s2? " + s1.equals(s2)); // true → same data
        System.out.println("s1 equals s3? " + s1.equals(s3)); // false → different data

        System.out.println("-----------------------------------");

        // ---------------------------------------------------
        // hashCode() demonstration
        // ---------------------------------------------------
        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode()); // same as s1 → correct
        System.out.println("HashCode of s3: " + s3.hashCode());
    }
}
