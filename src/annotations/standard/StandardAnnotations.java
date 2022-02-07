package annotations.standard;

import java.util.Random;

public class StandardAnnotations {

    @Deprecated // <- this
    public static void oldCode() {
        Random r = new Random();
        int randomInt = r.nextInt(100);
        if(randomInt % 2 == 0) {
            throw new RuntimeException("ERROR");
        }
    }

    public int getRandomNumber() {
        return 4; // гарантированно случайное! я кинул кубик.
    }

}
