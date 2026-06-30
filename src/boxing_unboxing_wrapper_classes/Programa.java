package boxing_unboxing_wrapper_classes;

public class Programa {
    public static void main(String[] args) {

        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);
    }
}
