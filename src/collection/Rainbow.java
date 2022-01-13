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
        rainbowList.add("\'R\' - is for Red");
        rainbowList.add("\'O\' - is for Orange");
        rainbowList.add("\'Y\' - is for Yellow");
        rainbowList.add("\'G\' - is for Green");
        rainbowList.add("\'B\' - is for Blue");
        rainbowList.add("\'I\' - is for Indigo");
        rainbowList.add("\'V\' - is for Violet");
        rainbowList.add("\'V\' - is for Violet");
        return rainbowList;
    }

//    public void printCollection(List<String> collection){
//        for(String tmp : collection){
//            System.out.println(tmp);
//        }
//    }

    public String findStringFirstVersion(String stringToFind, List<String> collection) {
        String s = null;
        for (String tmp : collection) {
            if (tmp.equalsIgnoreCase(stringToFind)) {
                s = tmp;
//            } else {
//                continue;
//            }
            }
        }
        return s;
    }
    public boolean findString1(String stringToFind, List<String> collection) {
        if(stringToFind == null || collection == null){
            throw new NullPointerException();
        }
        boolean result = false;
            result = collection.contains(stringToFind);
        return result;
    }
    public int findString2(String stringToFind, List<String> collection){
        if(stringToFind == null || collection == null){
            throw new NullPointerException();
        }
        int result = 0;
            for (int i = 0; i < collection.size(); i++) {
                if(collection.get(i).equals(stringToFind)){
                    result = i;
                    break;
                }else{
                    result = -1;
                }
            }
            return result;
    }
//    public boolean findString2(String stringToFind, List<String> collection) {
//        boolean result = false;
//        try {
//            result = collection.stream().anyMatch(tmp -> collection.contains(stringToFind));
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return result;
//    }
}
