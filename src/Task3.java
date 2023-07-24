public class Task3 {

    public static <T extends Comparable> T getMax(T o1, T o2) {
        return o1.compareTo(o2) > 0 ? o1 : o2;
    }

}
