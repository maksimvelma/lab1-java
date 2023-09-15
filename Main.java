import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Введіть цілі числа:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Сортування методом бульбашки по спаданню модулів
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
                    // Обмін елементів
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Відсортований масив за спаданням модулів:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
