public class subset {

    static void printPowerSet(char[] set, int set_size) {

        long size = (long) Math.pow(2, set_size);
        int counter, j;

        for (counter = 0; counter < size; counter++) {
            for (j = 0; j < set_size; j++) {
                if ((counter & (1 << j)) > 0)
                    System.out.print(set[j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[] set = { 'a', 'b', 'c' };
        // printPowerSet(set, 3);

        System.out.println((1<<2)&1);
    }
}
