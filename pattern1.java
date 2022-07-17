/*
1
22
333
4444
555
66
7
 */

class pattern1 {
    public static void main(String argument[]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = j; k <= j; k++) {
                    System.out.print(i + 1);
                }
            }
            System.out.println();
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                for (int k = j; k <= j; k++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}