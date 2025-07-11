public class Task3{
    public static void main(String[] args) {

        // Массивы из задачи 1
        int[] firstArray = {1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] thirdArray = {"Привет", "Java", "массивы", "ДЗ"};

        // Вывод первого массива в обратном порядке
        System.out.print("Первый массив в обратном порядке: ");
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i < firstArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(firstArray[i]);
        }
        System.out.println();

        // Вывод второго массива в обратном порядке
        System.out.print("Второй массив в обратном порядке: ");
        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i < secondArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(secondArray[i]);
        }
        System.out.println();

        // Вывод третьего массива в обратном порядке
        System.out.print("Третий массив в обратном порядке: ");
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            if (i < thirdArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(thirdArray[i]);
        }
        System.out.println();
    }
}