public class Task1 {
    public static void main(String[] args) {

        // 1. Целочисленный массив
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        // 2. Массив дробных чисел
        double[] secondArray = {1.57, 7.654, 9.986};

        // 3. Произвольный массив (строки)
        String[] thirdArray = new String[4];
        thirdArray[0] = "Привет";
        thirdArray[1] = "Java";
        thirdArray[2] = "массивы";
        thirdArray[3] = "ДЗ";

        // Вывод первого массива
        System.out.print("Первый массив: ");
        for (int i = 0; i < firstArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(firstArray[i]);
        }
        System.out.println();

        // Вывод второго массива
        System.out.print("Второй массив: ");
        for (int i = 0; i < secondArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(secondArray[i]);
        }
        System.out.println();

        // Вывод третьего массива
        System.out.print("Третий массив: ");
        for (int i = 0; i < thirdArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(thirdArray[i]);
        }
        System.out.println();
    }
}