public static void main(String[] args) {

    for (int i = 0; i <= 5; i++) {
        System.out.println("Hi" + i);
    }

    for (int j = 0; j <= 9; j++) {
        System.out.println("Outer Loop" + j);

        for (int k = 0; k <= 6; k++) {
            System.out.println("Nested inner loop" + k);
        }
    }

    int i = 0;
    for (; i < 5;) {
        System.out.println("without incrementing " + i);
        i++;
    }
}