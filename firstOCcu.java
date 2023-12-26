public class firstOCcu {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
             
                int j = 0;
                int n = i;

                 while(j<needle.length()){
                     if(haystack.charAt(n)!=needle.charAt(j)){
                        System.out.println("break "+haystack.charAt(n)+" "+needle.charAt(j));
                     }
                     n++;
                     j++;
                 }

                 if(j==needle.length())return i;
            }
        }

        return -1;
    }
}
