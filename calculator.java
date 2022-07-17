import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sobj_a = new Scanner(System.in);
        Scanner sobj_b = new Scanner(System.in);
        Scanner sobj_choice = new Scanner(System.in);
        int a, b, choice = 1;
        Exit: {
            while (true) {
                System.out.println("\n1 : Addition");
                System.out.println("2 : Subtraction");
                System.out.println("3 : Multiplication");
                System.out.println("4 : Division");
                System.out.println("5 : Exit\n");
                System.out.println("Enter your choice : ");
                choice = sobj_choice.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter two values which you want to Add : ");
                        a = sobj_a.nextInt();
                        b = sobj_b.nextInt();
                        System.out.println("The Addition of your entered number is " + (a + b));
                        break;

                    case 2:
                        System.out.print("Enter two values which you want to Subtract : ");
                        a = sobj_a.nextInt();
                        b = sobj_b.nextInt();
                        System.out.println("The Subtraction of your entered number is " + (a - b));
                        break;

                    case 3:
                        System.out.print("Enter two values which you want to Muliply : ");
                        a = sobj_a.nextInt();
                        b = sobj_b.nextInt();
                        System.out.println("The Multiplication of your entered number is " + (a * b));
                        break;

                    case 4:
                        System.out.print("Enter two values which you want to Divide : ");
                        a = sobj_a.nextInt();
                        b = sobj_b.nextInt();
                        System.out.println("The Division of your entered number is " + (a / b));
                        break;

                    case 5:
                        break Exit;

                    default:
                        System.out.println("Enter valid input");
                }
            }
        }
        sobj_a.close();
        sobj_b.close();
        sobj_choice.close();
    }
}