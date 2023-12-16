package java.heaps;

import java.util.PriorityQueue;

public class pqForObject{

     static class Student  implements Comparable<Student> {

         int rank;
         String name;

         Student(int r, String name){
            this.name = name;
            this.rank = r;
         }

         @Override 
         public int compareTo(Student s2){
            return this.rank - s2.rank;
         }
 
     }

    
    public static void main(String[] args) {
        // Comparator.reverseOrder()
        PriorityQueue<Student>q = new PriorityQueue<>();
        q.add(new Student(4,"hitesh"));
        q.add(new Student(2,"monu"));
        q.add(new Student(100,"sunil"));

        while(!q.isEmpty()){
            Student v = q.remove();
            System.out.println(v.rank+" "+v.name);
        }

    }
}
