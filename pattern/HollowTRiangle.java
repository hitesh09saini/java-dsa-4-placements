public class HollowTRiangle {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - i; j++) {
                System.out.print(" ");
            }
            int e = i;
            for (int j = e - 1; j >= 0; j--) {
                if (j == 0 || i == 0 || i == 7 || j == e - 1) {

                    if (j % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
