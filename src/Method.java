import java.util.Locale;
import java.util.Scanner;

public class Method {
    //Task 1
    static void number(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }

    // Task 2
    static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+ ");
            }
            System.out.println();

        }
    }

    // Task 3
    static void drawRectangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+ ");
            }
            System.out.println();

        }
    }

    // Task 4
    static int getMax(int numberOne, int numberTwo) {
        int max;
        if (numberOne > numberTwo)
            max = numberOne;
        else
            max = numberTwo;

        return max;

    }

    // overloading getMax
    static void getMax(int numberOne, float numberTwo) {
        float max;
        if (numberOne > numberTwo)
            max = numberOne;
        else
            max = numberTwo;
        System.out.println("Max overloading: " + max);

    }


    //Task 5
    static void recursion(int x) {
        if (x != 1)
            recursion(x - 1);
        System.out.println(x);
    }

    // Task 6
    static void drawRectangleRecursion(int width, int height) {

        if (height > 1) {
//               System.out.print("+ ");
//                width--;
            drawRectangleRecursion(width, height - 1);
        }
        if (width > 0) {
            drawRectangleRecursion(width - 1, 0);
            System.out.print("+ ");
        } else {
            //         height--;
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter argument: ");
        int argument = input.nextInt();
        int x = argument;
        number(x);

        System.out.println("\n" + "drawRectangle 3x2: ");
        drawRectangle(3, 2);

        System.out.println("\n" + "method overloading 2x2: ");
        drawRectangle(2);

        System.out.println("\n" + "method overloading 3x3: ");
        drawRectangle(3);

        System.out.println();

        System.out.print("Enter 2 any integers: ");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int max = getMax(numberOne, numberTwo);
        System.out.println("Max = " + max);

        System.out.println();

        System.out.print("Enter 2 any integers and floats: ");
        int numberOneInt = input.nextInt();
        float numberTwoFloat = input.nextFloat();
        getMax(numberOneInt, numberTwoFloat);

        System.out.println();

        // Task 5
        System.out.println("Recursion task 5: ");
        recursion(x);

        // Task 6

        System.out.println("drawRectangleRecursion 3x2: ");
        drawRectangleRecursion(3, 2);

        System.out.println();
        System.out.println();

        // Task 7
        System.out.println("Task 7: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("What task do you want to solve? Enter a number between 1 and 6 ");
            int task = input.nextInt();

            if (task == 1) {
                number(x);
            } else if (task == 2)
                drawRectangle(3, 2);
            else if (task == 3)
                drawRectangle(2);
            else if (task == 4) {
                System.out.print("Enter 2 any integers: ");
                int numberOneTask = input.nextInt();
                int numberTwoTask = input.nextInt();
                int maxTask = getMax(numberOne, numberTwo);
                System.out.println("Max = " + max);
            } else if (task == 5) {
                recursion(x);
            } else if (task == 6) {
                drawRectangleRecursion(3, 2);
            } else if (task > 6) {
                System.out.println("Wrong. Enter the task number from 1 to 6: ");
            }

            System.out.println("Do you want to continue resolving tasks? (yes or no): ");
            String resolved = input.next();
            for (int j = 0; j < 2; j++) {
                if (resolved == "yes") {
                    System.out.println("What task do you want to solve? Enter a number between 1 and 6: ");
                }

                if (resolved == "no");
                }
        }

    }
}

