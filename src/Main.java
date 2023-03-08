import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {

        System.out.println("Задача 1");

        int[] weight = new int[]{1, 2, 3};
        double[] number = {1.57, 7.654, 9.986};
        int[] year = {2020, 2021, 2022, 2023};
    }
    public static void task2() {

        System.out.println("Задача 2");

        int[] dog = new int[]{1, 2, 3};
        double[] many = {1.57, 7.654, 9.986};
        int[] cat = {10, 20, 30};
        System.out.println(dog[0] + ", " + dog[1] + ", " + dog[2]);
        System.out.println(many[0] + ", " + many[1] + ", " + many[2]);
        System.out.println(cat[0] + ", " + cat[1] + ", " + cat[2]);
    }
    public static void task3() {

        System.out.println("Задача 3");

        int[] cow = new int[]{1, 2, 3};
        double[] dollars = {1.57, 7.654, 9.986};
        int[] ice = {112, 144, 248};
        System.out.println(cow[2] + ", " + cow[1] + ", " + cow[0]);
        System.out.println(dollars[2] + ", " + dollars[1] + ", " + dollars[0]);
        System.out.println(ice[2] + ", " + ice[1] + ", " + ice[0]);
    }
    public static void task4() {

        System.out.println("Задача 4");

        int[] map = {1, 2, 3};
        for (int i = 0; i < map.length; i++) {
            if (map[i] % 2 != 0) {
                map[i] += 1;
            }
        }
        System.out.print(Arrays.toString(map));
    }
}