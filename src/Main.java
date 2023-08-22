import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] dogs = new int[]{1, 2, 3};
        double[] cats = {1.57, 7.645, 9.986};
        int[] cows = {10, 2, 4};
        System.out.println("Задача №1\n");
    }

    public static void task2() {
        int[] dogs = new int[]{1, 2, 3};
        double[] cats = {1.57, 7.645, 9.986};
        int[] cows = {10, 2, 4};
        System.out.println("Задача №2");

        System.out.println(Arrays.toString(dogs));

        for (int i = 0; i < cats.length; i++) {
            if (i == cats.length - 1) {
                System.out.println(cats[i]);
                break;
            }
            System.out.print(cats[i] + ", ");
        }

        System.out.println(Arrays.toString(cows));
    }

    public static void task3() {
        int[] dogs = new int[]{1, 2, 3};
        double[] cats = {1.57, 7.645, 9.986};
        int[] cows = {10, 2, 4};
        System.out.println("\nЗадача №3");

        for (int i = dogs.length -1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(dogs[i]);
                break;
            }
            System.out.print(dogs[i] + ", ");
        }

        for (int i = cats.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(cats[i]);
                break;
            }
            System.out.print(cats[i] + ", ");
        }

        int [] reverseCows = new int[cows.length];
        int plus = 0;

        for (int i = 1; i <= cows.length; i++) {
            reverseCows[plus++] = cows[cows.length - i];
        }
        System.out.println(Arrays.toString(reverseCows));
    }

    public static void task4() {
        int[] dogs = new int[]{1, 20, 3, 40, 5, 60, 7};
        System.out.println("\n\nЗадача №4");

        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] % 2 != 0 && i == dogs.length -1) {
                dogs[i] += 1;
                System.out.print(dogs[i] + ". ");
                break;
            }
            else if (i == dogs.length -1) {
                System.out.print(dogs[i] + ". ");
                break;
            }
            else if (dogs[i] % 2 != 0) {
                dogs[i] += 1;
                System.out.print(dogs[i] + ", ");
            }
            else {
                System.out.print(dogs[i] + ", ");
            }
        }
        System.out.println("\n" + Arrays.toString(dogs)); // проверка вне цикла
    }
}