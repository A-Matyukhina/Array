package arrayArray;

public class ArrayMain {
    public static void main(String[] args) {
        AnyWorkWithArray workWithArray = new AnyWorkWithArray();
//        String[]myArray = workWithArray.createArray();
//        workWithArray.print(workWithArray.createArray());
//        workWithArray.print(myArray);
        AnyWorkWithDynArray2 withDynArray2 = new AnyWorkWithDynArray2();
//        withDynArray2.createArrayList();
//        System.out.println(withDynArray2.createArrayList().size());
        withDynArray2.printArrayList(withDynArray2.createArrayList());
    }
}
