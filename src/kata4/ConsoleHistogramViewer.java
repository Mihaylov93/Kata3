package kata4;

public class ConsoleHistogramViewer<T> implements HistogramViewer<T> {
       
    @Override
    public void show(Histogram<T> histogram){
        for (T item : histogram.keySet()) {
            System.out.println(item + " " + histogram.get(item));
        }
    }
    
}
