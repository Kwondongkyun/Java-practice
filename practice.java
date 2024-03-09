import java.util.*;


public class practice {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(Integer.valueOf(6));

        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
   }
}

