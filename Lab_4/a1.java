import java.util.Comparator;

public class a1 implements Comparator <cars> {
    @Override
    public int compare(cars o1, cars o2){
        return o2.price - o1.price;
    }
}
