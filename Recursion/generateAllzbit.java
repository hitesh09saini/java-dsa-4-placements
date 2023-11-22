public class generateAllzbit {
    public static void main(String[] args) {
        generateBits(4);
    }

    private static void generateBits(int i) {
        generate(0, new int[i]);
    }

    private static void generate(int i, int[] bits) {

        if(i == bits.length){
            Print(bits);
            return ;
        }
        bits[i] = 0;
        generate(i+1, bits);
        bits[i] = 1;
        generate(i+1, bits);
    }

    private static void Print(int[] bits) {
        for(int i=0;i<bits.length;i++){
            System.out.print(bits[i]+" ");
        }System.out.println();
    }
}
