public class PalindromicPattern {
    
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=0;j <6-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
           
            for(int j=1;j<i;j++){

                System.out.print(j+1);
            }System.out.println();
        }
    }
}
