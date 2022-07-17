class pattern2 {
    public static void main(String argc[]) {
        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}