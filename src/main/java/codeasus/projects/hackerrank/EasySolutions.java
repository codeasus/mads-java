package codeasus.projects.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EasySolutions {
    private static void logException(String message) {
        System.out.printf("Exception occurred: %s\n", message);
    }

    //    https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
    public static void stdInAndStdOut1() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextInt());
        }
        scanner.close();
    }

    //    https://www.hackerrank.com/challenges/java-if-else
    public static void ifElse() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            if (N % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (N > 20) System.out.println("Not Weird");
                else if (N >= 6) System.out.println("Weird");
                else if (N >= 2) System.out.println("Not Weird");
            }
        } catch (IOException ioException) {
            logException(ioException.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioException) {
                logException(ioException.getMessage());
            }
        }
    }

    //    https://www.hackerrank.com/challenges/java-stdin-stdout
    public static void stdInAndStdOut2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        scanner.nextLine();
        String c = scanner.nextLine();
        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
        scanner.close();
    }

    //    https://www.hackerrank.com/challenges/java-output-formatting
    public static void outputFormatting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        while (scanner.hasNextLine()) {
            String language = scanner.next();
            int point = scanner.nextInt();
            System.out.printf("%-15s%03d\n", language, point);
        }
        System.out.println("================================");
    }

    //    https://www.hackerrank.com/challenges/java-loops-i
    public static void loops1() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", N, i, N * i);
            }
        } catch (IOException ioException) {
            logException(ioException.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioException) {
                logException(ioException.getMessage());
            }
        }
    }

    public static void loops2() {
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();
        while (lineCount-- != 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int total = a;
            for (int i = 0; i < n; i++) {
                total += (int) (b * Math.pow(2, i));
                System.out.printf("%d ", total);
            }
            System.out.println();
        }
        scanner.close();
    }
}
