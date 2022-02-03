package annotations.standard;

public class AnnotationDemoApp {
    public static void main(String[] args) {

    }

    @SuppressWarnings("deprecation")
    public static void iKnowWhatIAmDoing() {
        StandardAnnotations.oldCode();
    }
}
