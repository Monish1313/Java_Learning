import java.util.Arrays;

public class T13_Strings {
    public static void main(String args[])
    {
        String[] name={"Monish","Manoj"};
        System.out.println(name[0]);

        String name1="Selvam";
        System.out.println("name1");

        String name2=new String();
        System.out.println(name2);

        // -----------------------------
        // STRING METHODS
        // -----------------------------
        System.out.println("=== STRING METHODS ===");

        String s = "Hello World";

        System.out.println("Original String: " + s);
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Substring(0, 5): " + s.substring(0, 5));
        System.out.println("Contains 'World'? " + s.contains("World"));
        System.out.println("StartsWith 'He'? " + s.startsWith("He"));
        System.out.println("EndsWith 'ld'? " + s.endsWith("ld"));
        System.out.println("CharAt(4): " + s.charAt(4));
        System.out.println("IndexOf('W'): " + s.indexOf('W'));
        System.out.println("LastIndexOf('l'): " + s.lastIndexOf('l'));
        System.out.println("Replace 'World' with 'Java': " + s.replace("World", "Java"));
        System.out.println("Concat: " + s.concat("!!!"));
        System.out.println("Equals: " + s.equals("Hello World"));
        System.out.println("EqualsIgnoreCase: " + s.equalsIgnoreCase("Hello world"));
        System.out.println("CompareTo: " + s.compareTo("Hello"));
        System.out.println("CompareToIgnoreCase: " + s.compareToIgnoreCase("hello world"));
        System.out.println("isEmpty: " + s.isEmpty());

        // Split
        String[] arr = s.split(" ");
        System.out.println("Split result: " + arr[0] + " , " + arr[1]);

        // Array toString (1D)
        System.out.println("Arrays.toString(arr): " + Arrays.toString(arr));

        // 2D array for deepToString()
        String[][] deepArr = { {"Hello", "World"}, {"Java", "Methods"} };
        System.out.println("Arrays.deepToString(deepArr): " + Arrays.deepToString(deepArr));

        // Java 11 strip methods
        String s2 = "   Java String   ";
        System.out.println("Trimmed: '" + s2.trim() + "'");
        System.out.println("Strip: '" + s2.strip() + "'");
        System.out.println("StripLeading: '" + s2.stripLeading() + "'");
        System.out.println("StripTrailing: '" + s2.stripTrailing() + "'");

        // Join
        String joined = String.join("-", "Java", "String", "Method");
        System.out.println("Joined: " + joined);

        // Repeat
        System.out.println("Repeat: " + "Hi ".repeat(3));

        // matches()
        System.out.println("Matches '.*World': " + s.matches(".*World"));

        // char array
        char[] chars = s.toCharArray();
        System.out.println("toCharArray[1]: " + chars[1]);

        // bytes
        byte[] bytes = s.getBytes();
        System.out.println("getBytes[0]: " + bytes[0]);

        // toString() on String (default)
        System.out.println("toString(): " + s.toString());


        // -----------------------------
        // STRINGBUFFER METHODS
        // -----------------------------
        System.out.println("\n=== STRINGBUFFER METHODS ===");

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original Buffer: " + sb);

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // delete & deleteCharAt
        sb.delete(2, 7);
        System.out.println("After delete: " + sb);
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // substring (StringBuffer)
        System.out.println("Substring(0,3): " + sb.substring(0, 3));

        // charAt & setCharAt
        System.out.println("CharAt(1): " + sb.charAt(1));
        sb.setCharAt(1, 'Z');
        System.out.println("After setCharAt: " + sb);

        // Capacity and Length
        System.out.println("Length: " + sb.length());
        System.out.println("Initial Capacity: " + sb.capacity());

        // Ensure Capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // Set Length
        sb.setLength(5);
        System.out.println("After setLength(5): " + sb);

        // StringBuffer toString()
        System.out.println("StringBuffer.toString(): " + sb.toString());
    



    }
    
    
}
