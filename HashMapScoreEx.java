import java.util.*;
public class HashMapScoreEx {
    public static void main(String[] args){
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();

        scoreMap.put("kevin", 100);
        scoreMap.put("jessica", 97);
        scoreMap.put("james", 88);
        scoreMap.put("alice", 92);
        scoreMap.put("christin", 95);

        System.out.println(scoreMap.size());

        Set<String> keys = scoreMap.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println(name+" : "+score);
        }
    }
    
}
