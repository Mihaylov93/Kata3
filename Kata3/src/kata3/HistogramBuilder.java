package kata3;

public class HistogramBuilder <Type> {
    
    public Histogram<Type> build (Type[] types){
        Histogram<Type> result = new Histogram<>();
        for (Type type : types) {
            if (result.containsKey(type)) 
                result.put(type, result.get(type)+1);
        }
        return result;
    
    }
}
