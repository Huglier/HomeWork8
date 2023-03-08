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

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] number = {1.57, 7.654, 9.986};
        int[] year = {2020, 2021, 2022, 2023};
    }
    public static void task2() {

        System.out.println("Задача 2");

        int[] dog = new int[]{1, 2, 3};
        double[] many = {1.57, 7.654, 9.986};
        int[] cat = {10, 20, 30};
        for (int i = 0; i < dog.length; i++) {
            System.out.print(dog[i]);
            if (i!= dog.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < many.length; i++) {
            System.out.print(many[i]);
            if (i!= many.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < cat.length; i++) {
            System.out.print(cat[i]);
            if (i!= cat.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3() {

        System.out.println("Задача 3");

        int[] cow = new int[]{1, 2, 3};
        double[] dollars = {1.57, 7.654, 9.986};
        int[] ice = {112, 144, 248};
        for (int i = cow.length - 1; i >= 0; i--) {
           System.out.print(cow[i]);
           if(i!=0){
               System.out.print(", ");
           }
        }
        System.out.println();
        for (int i = dollars.length - 1; i >= 0; i--) {
            System.out.print(dollars[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = ice.length - 1; i >= 0; i--) {
            System.out.print(ice[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();

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