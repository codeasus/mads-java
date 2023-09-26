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

    //    https://www.hackerrank.com/challenges/java-stdin-stdout
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

    //    https://www.hackerrank.com/challenges/java-datatypes
    public static void dataTypes() {
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();
        scanner.nextLine();
        while (lineCount-- != 0) {
            String strNumber = scanner.nextLine();
            try {
                long number = Long.parseLong(strNumber);
                System.out.printf("%d can be fitted in: \n", number);
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte\n* short\n* int\n* long");
                } else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short\n* int\n* long");
                } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int\n* long");
                } else {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.printf("%s can't be fitted anywhere.\n", strNumber);
            }
        }
        scanner.close();
    }

    //    https://www.hackerrank.com/challenges/java-end-of-file
    public static void endOfFile() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while (scanner.hasNextLine()) {
            System.out.printf("%d %s\n", counter++, scanner.nextLine());
        }
        scanner.close();
    }

    private static int area(int breadth, int height) throws Exception {
        if (breadth < 0 || height < 0) {
            throw new Exception();
        }
        return breadth * height;
    }

    public void staticInitializer() {
        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        try {
            System.out.println(area(breadth, height));
        } catch (Exception e) {
            System.out.printf("%s\n", e);
        }
    }
}