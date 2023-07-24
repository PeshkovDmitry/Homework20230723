public class Main {
    public static void main(String[] args) {
//        Task1();
//        Task2();
//        Task3();
        Task4();
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

    static void Task3() {
        Integer i1 = 5;
        Integer i2 = 8;
        System.out.printf("Для пары [%s;%s] большее - %s\n", i1, i2, Task3.getMax(i1, i2));
        Double d1 = 5.0;
        Double d2 = 4.1;
        System.out.printf("Для пары [%s;%s] большее - %s\n", d1, d2, Task3.getMax(d1, d2));
        String s1 = "Веселый";
        String s2 = "Грустный";
        System.out.printf("Для пары [%s;%s] большее - %s\n", s1, s2, Task3.getMax(s1, s2));
    }

    static void Task4() {
        DataContainer<String> dataContainer = new DataContainer<>(String::new);
        dataContainer.add("Привет");
        dataContainer.add("меня");
        dataContainer.add("зовут");
        dataContainer.add("Дмитрий");
        dataContainer.print();
        dataContainer.sort((s1,s2) -> s2.length() - s1.length());
        System.out.println("После сортировки...");
        dataContainer.print();
    }
}