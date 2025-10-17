package lesson_9_arrays;

public class Main {

    static void main() {
        // Створити масив цілих чисел і ініціалізувати його будь-якими значеннями
        int[] arr1 = new int[3]; // 0, 0, 0
        arr1[0] = 4;
        arr1[1] = 55;
        arr1[2] = 1;

        int[] arr2 = {100, 200, 300, 400};

        // Вивести у консоль довжину масиву
        int length = arr2.length;
        System.out.println("Довжина масиву arr2: " + length);

        // Вивести значення кожного елементу масиву у консоль
        System.out.print("Виведемо значення масиву arr1: ");
        System.out.print(" " + arr1[0]);
        System.out.print(" " + arr1[1]);
        System.out.print(" " + arr1[2]);

        System.out.println();

        System.out.println("Виведемо значення масиву arr2: " + arr2[0]
                + ", " + arr2[1] + ", " + arr2[2] + arr2[3]);

        System.out.printf("Довжина масиву arr1: %s \n", arr1.length);

        System.out.println("-----------");


        // Змінити місцями елементи масиву під індексами 0 та 1
        int [] arr3 = {33, 55, 77};
        System.out.println("Виведемо значення масиву arr3 до перетворення: " + arr3[0]
                + ", " + arr3[1] + ", " + arr3[2]);

        int a = arr3[0];
        int b = arr3[1];

        arr3[0] = b;
        arr3[1] = a;
        System.out.println("Виведемо значення масиву arr3 після перетворення: " + arr3[0]
                + ", " + arr3[1] + ", " + arr3[2]);


    }
}
