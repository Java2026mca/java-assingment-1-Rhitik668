import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            // Menu
            System.out.println("\n=== Shape Area Calculator ===");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Circle
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    double circleArea = Math.PI * r * r;
                    System.out.println("Area of Circle = " + circleArea);
                    break;

                case 2:
                    // Rectangle
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = sc.nextDouble();
                    double rectangleArea = length * breadth;
                    System.out.println("Area of Rectangle = " + rectangleArea);
                    break;

                case 3:
                    // Triangle
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("Area of Triangle = " + triangleArea);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
