package kata4;

import java.util.HashMap;

public class Histogram<T> extends HashMap<T, Integer>{

    @Override
    public Integer get(Object key){
        if(this.containsKey((T)key))
            return super.get(key);
        return 0;
    }
}
