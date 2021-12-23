package exceptions;

public class Exception1 {

/*
    Checked <-> unchecked
 */

    public static void callMethod() {
//        getCustomerById1(1); // <-- same 2 options!
    }

    public static void getCustomerById1(int id) throws NoSuchMethodException {
        throw new NoSuchMethodException("Not implemented");
    }

    public static void getCustomerById2(int id) {
        try {
            throw new NoSuchMethodException("Not implemented");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            int zero = 0;
            int some = 1 / zero;
        }
        catch (Exception e) {
            System.out.println("Could not divide by zero");
        }
    }

    private int getCustomerIdFromDatabase() {
        throw new RuntimeException("database not available");
    }

    private int getDefaultId() {
        return 10;
    }

    private int getCustomerIdFromDbOrDefault() {
        int customerId;
        try{
            customerId = getCustomerIdFromDatabase();
        }
        catch (Exception e) {
            customerId = getDefaultId();
        }
        return customerId;
    }

}
