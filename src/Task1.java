public class Task1 {
    public static void main(String[] args) {

        // 1. Целочисленный массив, созданный с помощью new
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        // 2. Массив дробных чисел, заполненный сразу
        double[] secondArray = {1.57, 7.654, 9.986};

        // 3. Произвольный массив (например, массив строк)
        String[] thirdArray = new String[4];
        thirdArray[0] = "Привет";
        thirdArray[1] = "Java";
        thirdArray[2] = "массивы";
        thirdArray[3] = "ДЗ";

        // Выводим содержимое массивов
        System.out.println("Первый массив:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Элемент " + i + ": " + firstArray[i]);
        }

        System.out.println("\nВторой массив:");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("Элемент " + i + ": " + secondArray[i]);
        }

        System.out.println("\nТретий массив:");
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.println("Элемент " + i + ": " + thirdArray[i]);
        }
    }
}