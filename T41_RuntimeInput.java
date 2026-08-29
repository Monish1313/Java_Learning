// T51_RuntimeInputScannerBufferedReader.java

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class T41_RuntimeInput {

    public static void main(String[] args) throws IOException {

        // =================================================
        // 1️⃣ Runtime Input using SCANNER
        // =================================================
        // Scanner is easy to use and beginner-friendly
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age (Scanner): ");
        int age = sc.nextInt();      // reads integer

        System.out.print("Enter name (Scanner): ");
        String name = sc.next();     // reads single word

        System.out.println("Scanner Output -> Name: " + name + ", Age: " + age);

        System.out.println("--------------------------------");

        // =================================================
        // 2️⃣ Runtime Input using BUFFEREDREADER
        // =================================================
        // BufferedReader is faster and used for large input

        /*InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr); */
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in));

        System.out.print("Enter age (BufferedReader): ");
        int age2 = Integer.parseInt(br.readLine()); // string → int

        System.out.print("Enter name (BufferedReader): ");
        String name2 = br.readLine();  // reads full line

        System.out.println("BufferedReader Output -> Name: " + name2 + ", Age: " + age2);

        // Close resources (good practice)
        sc.close();
        br.close();
    }
}
