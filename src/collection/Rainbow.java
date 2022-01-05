package collection;

import java.util.ArrayList;
import java.util.List;
/*
написать метод, который находит данную строку в коллекции
например вот такой метод
public SomeReturnType find(String stringToFind, ArrayList<String> where);
 */
public class Rainbow {

    public List<String> createCollection() {
        List<String> rainbowList = new ArrayList<>();
        rainbowList.add("\'R\' - is for red");
        rainbowList.add("\'O\' - is for Orange");
        rainbowList.add("\'Y\' - is for Yellow");
        rainbowList.add("\'G\' - is for Green");
        rainbowList.add("\'B\' - is for Blue");
        rainbowList.add("\'I\' - is for Indigo");
        rainbowList.add("\'V\' - is for Violet");
        return rainbowList;
    }

    //    public void printCollection(List<String> collection){
//        for(String tmp : collection){
//            System.out.println(tmp);
//        }
//    }
    public String findString(String stringToFind, List<String> collection) {
        String s = null;
        for (String tmp : collection) {
            if (tmp.equalsIgnoreCase(stringToFind)) {
                s = tmp;
            } else {
                continue;
            }
        }
        return s;
    }
}
