public class Max_of_three_number {
    public static void main(String arg[]) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.print("A is Greater");
        }

        else if (b > a && b > c) {
            System.out.print("B is Greater");
        }

        else if (c > a && c > a) {
            System.out.print("C is Greater");
        }
    }
}
