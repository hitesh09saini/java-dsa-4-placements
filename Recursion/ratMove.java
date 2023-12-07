import java.util.ArrayList;

public class ratMove {
    public static void main(String[] args) {
        int a[][] = {{1,0,0,1},{1,1,0,0},{0,1,1,0},{1,1,1,1}};
        System.out.println(findPath(a, a.length));
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> res =  new ArrayList<>();
        if(m[0][0] ==0)
            return res;
            
        path(m,n,0,0,"",res);
        return res;
    }
    
     public static void path(int[][] m, int n ,int i,int j,String s,ArrayList<String> res){
        if(i==n-1 && j==n-1){
            res.add(s);
            return;
        }
        if(i >= n || j>= n)
            return;
            
        m[i][j] = 0;
        
        // down
        if(i+1<=n-1 && m[i+1][j] == 1){
            s+="D";
            path(m,n,i+1,j,s,res);
            s=s.substring(0,s.length()-1);
        }
        
        // left
        if(j-1>= 0 && m[i][j-1] == 1){
            s+="L";
            path(m,n,i,j-1,s,res);
            s=s.substring(0,s.length()-1);
        }
        
        // up
        if(i-1 >= 0 && m[i-1][j] == 1){
            s+="U";
            path(m,n,i-1,j,s,res);
            s=s.substring(0,s.length()-1);
        }
        
        // right
        if(j+1<=n-1 && m[i][j+1] == 1){
            s+="R";
            path(m,n,i,j+1,s,res);
            s=s.substring(0,s.length()-1);
        }
        
        m[i][j] = 1;
        
    }
}
