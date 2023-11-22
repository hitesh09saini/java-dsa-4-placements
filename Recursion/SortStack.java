import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(2);
        s.push(8);
        s.push(0);
        s.push(6);
        s.push(1);

        sortStack(s);

         while(!s.isEmpty()){
            System.out.println(s.pop());
         }

    }

    private static void sortStack(Stack<Integer> s) {

        if(s.isEmpty())return;
        int x = s.pop();
        sortStack(s);

        Stack<Integer> ns = new Stack<>();
        while(!s.isEmpty()){
            ns.push(s.pop());
        }

        s.push(x);
        
        while(!ns.isEmpty()){
           s.push(ns.pop());
        }

    }
}
