import java.util.Arrays;

public class LessonTwo {
    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr2 = new int[8];
        int number = 0;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = number;
            number = number + 3;
        }
        System.out.println(Arrays.toString(arr2));

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr3.length; i++){
            if(arr3[i] < 6)
                arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] table = new int[10][10];
        int startNumber = 0;
        int endNumber = 9;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                table[i][j] = 0;
                if((i == startNumber) || (j == endNumber)) {
                    table[i][j] = 1;
                }
                startNumber++;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
            ;
            startNumber = 0;
            endNumber--;
        }

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        // подпункт - и распечатайте индексы этих элементов
        int[] arr4 = {9, 5, 80, 44, 63, 2, 12, 57, 24, 8};
        int maxNumber = -99999;
        int indexMax = 0;
        int minNumber = 99999;
        int indexMin = 0;
        for(int i = 0; i < arr4.length; i++) {
            for(int k = 0; k < arr4.length; k++) {
                if((arr4[i] >= arr4[k]) && (arr4[i] > maxNumber)) {
                    maxNumber = arr4[i];
                    indexMax = i;
                }
            }
        }
        for(int i = 0; i < arr4.length; i++) {
            for(int k = 0; k < arr4.length; k++) {
                if((arr4[i] <= arr4[k]) && (arr4[i] < minNumber)) {
                    minNumber = arr4[i];
                    indexMin = i;
                }
            }
        }
        System.out.println(maxNumber + ", индекс " + indexMax);
        System.out.println(minNumber + ", индекс " + indexMin);

        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] arr5 = {7, 3, 6, 6, 9, 1, 15, 40, 7};
        System.out.println(checkBalance(arr5)); // Я, правда, не уверен, что правильно понял задание: массив должен делиться ровно пополам, или именно последние два элемента по сумме должны быть как остальные?
        // На всякий случай сделал сравнения последних двух элементов с остальными числами массива, как в примере... 

        // 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        //пример [0,0,0,0,0,5,0,0,0,1,9] -> на 2 сдвигаем [1,9,0,0,0,0,0,5,0,0,0]
        int[] arr6 = {4, 6, 3, 1, 9, 5, 2, 0, 7, 8};
        int movie = 2;
        System.out.println(Arrays.toString(movieElements(arr6, movie)));

    }

    public static boolean checkBalance(int arr5[]) {
        int summ1 = 0;
        int summ2 = arr5[arr5.length - 1] + arr5[arr5.length - 2];
        for(int i = 0; i < (arr5.length - 2); i++) {
            summ1 = summ1 + arr5[i];
        }
        if(summ1 == summ2)
            return true;
        else
            return false;


    }

    public static int[] movieElements(int[] arr6, int movie) {
        int temp;
        if(movie == 0)
            return arr6;
        while(movie > 0) {
            temp = arr6[arr6.length - 1];
            for(int i = (arr6.length - 1); i > 0; i--) {
                arr6[i] = arr6[i - 1];
            }
            arr6[0] = temp;
            movie--;
        }
        while(movie < 0) {
            temp = arr6[0];
            for(int i = 0; i < arr6.length; i++) {
                arr6[i] = arr6[i + 1];
            }
            arr6[arr6.length - 1] = temp;
            movie++;
        }
        return arr6;
    }
}
