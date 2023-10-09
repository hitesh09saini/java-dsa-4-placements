package String;

public class replaceString {
    public static void main(String[] args) {
        System.out.println(interpret("g()(al)"));
    }
    public static  String interpret(String command) {
        String newString = "";
        for(int i=0;i<command.length();i++){
            
            if(command.charAt(i)=='('){
                String s = "";
                char v = ' ';
                int j = i;
                while(v!= ')'){
                    v = command.charAt(j);
                    s+=v;
                    j++; 
                }
                i = j-1;
              
                if(s.equals("()")){
                    newString+="o";
                }else if(s.equals("(al)")){
                    newString+="al";
                }

            }
            else{
                     
                newString += command.charAt(i);
            }


        }
        
        return newString;
    }
    
}
