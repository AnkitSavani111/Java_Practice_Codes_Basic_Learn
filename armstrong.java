import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {

        int number, originalNumber, reminder, result = 0;
        Scanner sobj_number = new Scanner(System.in);
        System.out.println("Enter the value of number : ");
        number = sobj_number.nextInt();
        originalNumber = number;

        while (originalNumber != 0) {
            reminder = originalNumber % 10;
            result += Math.pow(reminder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        }

        else {
            System.out.println(number + " is not an Armstrong number.");
        }
        sobj_number.close();
    }
}