package comparable.comparator;

import java.util.Comparator;

public class SortByComparator implements Comparator<sort> {

    @Override
    public int compare(sort o1, sort o2) {
        double weight1 = o1.getWeight();
        double weight2 = o2.getWeight();
        if(weight1 > weight2){
            return 1;
        }
        if(weight1 < weight2){
            return -1;
        }else {
            return 0;
        }
    }
}
