public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задача 2");
        int[] arr1 = {1, 2, 3, 4, 5};
        int maxArr1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maxArr1) {
                maxArr1 = arr1[i];
            }
        }
        System.out.println(maxArr1);
    }
}

