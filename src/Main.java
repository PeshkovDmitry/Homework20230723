public class Main {
    public static void main(String[] args) {
//        Task1();
        Task2();

    }

    static void Task1() {
        Task1.printElement("Привет!");
        Task1.printElement(12);
        Task1.printElement(3.1415);
    }

    static void Task2() {
        Integer[] iarr = new Integer[] {1,2,3,4,5,6};
        Task2.printArray(iarr);
        String[] sarr = new String[] {"Однажды","в","студеную","зимнюю","пору"};
        Task2.printArray(sarr);

    }
}