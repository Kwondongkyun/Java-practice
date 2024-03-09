import java.util.*;
public class HashMapEx {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "apple");
        hm.put(2, "banana");
        hm.put(3, "kiwi");
        hm.put(4, "cherry");

        
        Set<Integer> keys = hm.keySet();
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key=it.next();
            String value = hm.get(key);
            System.out.println("("+key+","+value+")");
        }

    }
}
