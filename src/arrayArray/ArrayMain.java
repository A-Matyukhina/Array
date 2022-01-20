package arrayArray;

public class ArrayMain {
    public static void main(String[] args) {
        AnyWorkWithArray workWithArray = new AnyWorkWithArray();
        String[] array = workWithArray.createArray();
        workWithArray.print(array);
        System.out.println("\n--");
        workWithArray.printDifferently(array);
//        workWithArray.print(myArray);
//        AnyWorkWithDynArray2 withDynArray2 = new AnyWorkWithDynArray2();
//        withDynArray2.createArrayList();
//        System.out.println(withDynArray2.createArrayList().size());
//        withDynArray2.printArrayList(withDynArray2.createArrayList());



    }
}
