import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper part
        for (int i = 0; i < n; i++) {

            // Leading spaces
            if (i % 2 == 1) {
                System.out.print(" ");
            }

            // First star
            System.out.print("*");

            // Hollow part
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 2; i >= 0; i--) {

            // Leading spaces
            if (i % 2 == 1) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
