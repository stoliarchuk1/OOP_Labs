import java.util.Comparator;

public class a2 implements Comparator <cars> {
    @Override
    public int compare(cars p1, cars p2){
        return p1.mileage - p2.mileage;
    }
}
