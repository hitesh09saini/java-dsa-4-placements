public class bitFlip {

    public static void main(String[] args) {

        System.out.println(minBitFlips(10, 7));
    }

    public static int minBitFlips(int start, int goal) {
        int flips = 0;
        for (int i = 0; i < 32; i++) { // Assuming 32-bit integers
            int mask = 1 << i;
            if ((start & mask) != (goal & mask)) {
                start = start ^ mask;  /*   0^1 = 1 , 1^1 = 0
                 */
                flips++;
            }
        }
        return flips;
    }

}
