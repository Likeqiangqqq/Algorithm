import java.util.*;

public class Frequency {
    public int getFrequency(String[] article, int n, String word) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String key=article[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        int value=0;
        for(String key:map.keySet()){
            if(key.equals(word)){
                value=map.get(word);
                break;
            }
        }
        return value;
    }
}