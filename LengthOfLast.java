public class LengthOfLast {
    
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
             if(s.charAt(i)!=' '){
                c++;
             }else{
                if(c!=0){
                    System.out.println(c);
                    break;
                }
             }
        }
    } 
}
