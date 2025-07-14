public class Task4 {
    public static void main(String[] args) {

        // Исходный массив из задачи 1
        int[] array = {1, 2, 3};

        // Проходим по каждому элементу массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) { // Проверяем, является ли число нечётным
                array[i] += 1;       // Делаем его чётным
            }
        }

        // Выводим обновлённый массив
        System.out.print("Обновлённый массив: ");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}