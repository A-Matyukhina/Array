package comparable.comparator;
/*
Отсортировать какую-либо коллекцию при помощи Comparable и Comparator.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CakeSorted {
    public static void main(String[] args) {

        List<sort> cakeList = new ArrayList<>();
        cakeList.add(new sort("Napoleon", 2.5));
        cakeList.add(new sort("Tiramisu", 2.8));
        cakeList.add(new sort("Honey Cake", 3.0));
        cakeList.add(new sort("Marmalade Cake", 1.8));
        cakeList.add(new sort("Chocolate", 2.75));
        cakeList.add(new sort("Meringue Cake", 2.0));

        comparableSort(cakeList);
        comparatorSort(cakeList);
    }

    public static void comparableSort(List<sort> cakeList) {
        ArrayList<sort> cakes = new ArrayList<>(cakeList);
        Collections.sort(cakes);
        for (sort tmp : cakes) {
            System.out.println("Title: " + tmp.getName() + ", weight: " + tmp.getWeight());
        }
        System.out.println();
    }

    public static void comparatorSort(List<sort> cakeList) {
        List<sort> cakes = new ArrayList<>(cakeList);
        Collections.sort(cakes, new SortByComparator());
        for (sort tmp : cakes) {
            System.out.println("Title: " + tmp.getName() + ", weight: " + tmp.getWeight());
        }
    }
}
