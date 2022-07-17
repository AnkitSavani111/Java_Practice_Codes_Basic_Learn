import java.util.Scanner;

class Harmonic_series {
    public static void main(String argument[]) {
        float answer = 1;
        int n = 0;
        System.out.println("Enter value of N : ");
        Scanner obj_scanner = new Scanner(System.in);
        n = obj_scanner.nextInt();
        for (float i = 2; i <= n; i++) {
            answer = (answer + (1 / i));
        }
        System.out.println("The value of n is " + answer);
    }
}