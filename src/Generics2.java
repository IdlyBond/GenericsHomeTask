import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Generics2 {
    public <N extends Number & Comparable<N>> N getMaxElement(List<N> numbers){
        if (numbers.isEmpty()) return null;
        N max = numbers.get(0);
        for (N number: numbers) if(number.compareTo(max) > 0) max = number;
        return max;
    }
}
