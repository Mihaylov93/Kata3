package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] vec = {2,2,11,4,2,6,11,2,3,5,11,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < vec.length; i++) {
            Integer frec = map.get(vec[i]);
            if(frec != null) {
                map.put(vec[i], frec+1 );
            }else{
                map.put(vec[i], 1);
            }
            
        }
        for (Integer key : map.keySet()) {
                System.out.println(key + "->" + map.get(key));
            }
    }
    
    
}
