
   /*
    Условия:
    oneDimensionArray - массив содержащий не меньше 3 и не больше 99 элементов типа int.
    Среди них всегда есть хотя бы одно положительное, хотя бы одно отрицательное и хотя бы один 0.

    twoDimensionsArray - двумерный массив типа int. Представляет матрицу, содержащую не менее 5 и не более 100 столбцов, и не менее 5, но не более 10 строк.

    Подсказки:

    Для выполнения задания вспомните максимальные и минимальные значения целочисленных типов.

    Длина массива хранится в поле length. Например, длину массива myArray можно получить так: int myArrayLength = myArray.length

    Для выходя из метода используется ключевое слово return. Если после него стоит значение (или переменная), то это значение будет возвращено как результат работы метода.

    Метод main расположен последним в классе (находится в самом низу)

     */

package com.brunoyam.unit_1;

import com.brunoyam.unit_1.utils.Generator;

import java.util.Arrays;

public class Main {
    // public static void main (String args []){
    private static int[] oneDimensionArray = Generator.getOneDimensionArray();

    // private static void level1() {
    // }

    public static int findMaxValue(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }


    public static int findMinValue(int[] array) {
        int minValue = array[0];

        for (int i = 1; i > array.length; i--) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }


    public static int sumValues(int[] array) {
        int sumOfValues = array[0];

        for (int i = 1; i < array.length; ++i) {
            sumOfValues += array[i];

        }
        return sumOfValues;
    }


    public static int getFirstPositiveIndex(int[] array) {
        int firstPositiveIndex = array[0];

        for (int i = 0; i > array.length; i++) {
            if (array[i] > 0) {
                firstPositiveIndex = array[i];
            }

            for (; i > array.length; i++) {
                if (array[i] > 0 && array[i] > firstPositiveIndex)
                    firstPositiveIndex = array[i];
            }
        }
        return firstPositiveIndex;
    }


    public static int getFirstNegativeIndex(int[] array) {
        int firstNegativeIndex = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < firstNegativeIndex) {
                firstNegativeIndex = array[i];
            }
        }
        return firstNegativeIndex;
    }


    private static void level1() {


        int maxValue = findMaxValue(oneDimensionArray);


        int minValue = findMinValue(oneDimensionArray);
        int sumOfValues = sumValues(oneDimensionArray);

        int firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);

        int firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);


        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);

        //public static void main (String args []){
    }

    public static void main(String args[]) {
    }
}














   /*package com.brunoyam.unit_1;

           import com.brunoyam.unit_1.utils.Generator;

           import java.util.Arrays;
*/
/*public class Main {
    //public static void main(String[] args) {
    static int findMaxValue = 0;
    int [] oneDimensionArray = new int [] {6, 12, 18, 0, -7, 14, -2} ;
    private static int[] oneDimensionArray = com.brunoyam.unit_1.utils.Generator.getOneDimensionArray();
    public static void main(String[] args) {

        public static void level1 () {
            findMaxValue(oneDimensionArray);
            findMinValue(oneDimensionArray);
        }
        public static void findMaxValue( int [] oneDimensionArray){
            oneDimensionArray.sort(oneDimensionArray);
            maxValue =  oneDimensionArray[ oneDimensionArray.length -1 ];
            System.out.println(maxValue);

        *//*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод, вычисляющий значение переменной должен возвращать тот же тип.
        *//*

        int minValue = findMinValue(oneDimensionArray);

        int maxValue = findMaxValue(oneDimensionArray);

        int sumOfValues = sumValues(oneDimensionArray);

        int firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);

        int  firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);


        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);

    }
}*/























/* private static void level2() {

 *//*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод должен возвращать значение тогот же типа.
        *//*
 *//*тип*//* lastPositiveIndex = getLastPositiveIndex(oneDimensionArray);
 *//*тип*//* lastNegativeIndex = getLastNegativeIndex(oneDimensionArray);
        byte[] positiveNegativeNumber = countPositiveNegative(oneDimensionArray);

        System.out.println("last positive index: " + lastPositiveIndex);
        System.out.println("last negative index: " + lastNegativeIndex);
        System.out.println("total positives: " + positiveNegativeNumber[0]);
        System.out.println("total negatives: " + positiveNegativeNumber[1]);
    }

    private static void level3() {
        int[][] twoDimensionsArray = Generator.getTwoDimensionsArray();
        long[] arrayOfSums = sumSubArrays(twoDimensionsArray);

        System.out.println();
        System.out.println("Second part");
        System.out.println("result: " + Arrays.toString(arrayOfSums));

        sort(oneDimensionArray);

        System.out.println();
        for(int value : oneDimensionArray) {
            System.out.print(value + " ");
        }
    }

    *//* Укажите тип значения, которое будет возвращать метод*//*
    private static *//*тип*//* findMinValue(int[] arrayOfValues) {
 *//* Укажите тип переменной *//*
 *//*тип*//* minValue = arrayOfValues[0];
 *//*
           Используя цикл for переберите все значения массива и сохраните минимальное в переменную minValue.
         *//*
        return minValue;
    }

    *//* Укажите тип значения, которое будет возвращать метод*//*
    private static *//*тип*//* findMaxValue(int[] arrayOfValues) {
 *//* Укажите тип переменной *//*
 *//*тип*//* maxValue = arrayOfValues[0];
 *//*
           Используя цикл for переберите все значения массива и сохраните максимальное в переменную maxValue.
         *//*
        return maxValue;
    }

    *//* Укажите тип значения, которое будет возвращать метод*//*
    private static *//*тип*//* sumValues(int[] arrayOfValues) {
 *//* Укажите тип переменной *//*
 *//*тип*//* sum = 0;
 *//* Используя цикл for переберите все значения массива, просуммируйте и сохраните сумму всех значений в переменную sum. *//*
        return sum;
    }

    *//* Укажите тип значения, которое будет возвращать метод*//*
    private static *//*тип*//* getFirstPositiveIndex(int[] arrayOfValues) {
 *//* Укажите тип переменной *//*
 *//*тип*//* firstPositiveIndex = 0;
 *//* Используя цикл while найдите индекс первого положительного значения в массиве и сохраните в переменную firstPositiveIndex *//*
        return firstPositiveIndex;
    }

    *//* Укажите тип значения, которое будет возвращать метод*//*
    private static *//*тип*//* getFirstNegativeIndex(int[] arrayOfValues) {
 *//* Укажите тип переменной *//*
 *//*тип*//* firstNegativeIndex = 0;
 *//* Используя цикл while найдите первое отрицательное значение и сохраните в переменную firstNegativeIndex *//*
        return firstNegativeIndex;
    }

    *//* Укажите тип значения, которое будет возвращать метод*//*
    private static *//*тип*//* getLastPositiveIndex(int[] arrayOfValues) {
 *//*
        Найдите последнее положительное значение в массиве.
        Верните найденное значение используя ключевое слово return.
         *//*
    }

    *//* Укажите тип значения, которое будет возвращать метод*//*
    private static *//*тип*//* getLastNegativeIndex(int[] arrayOfValues) {
 *//*
        Найдите последнее отрицательное значение в массиве.
        Верните найденное значение используя ключевое слово return.
         *//*
    }

    private static byte[] countPositiveNegative(int[] arrayOfValues) {
        byte[] result = new byte[2];

        *//*
        Посчитайте количество положительных и отрицательных значений в массиве arrayOfValues.
        Результат сохраните в массив result:
            В первый элемент - количество положительных
            Во второй элемент - количество отрицательных
         *//*

        return result;
    }

    private static long[] sumSubArrays(int[][] arrayOfValues) {
        *//*
        Объявите массив типа long, сохраните в него результат сложения значений во всех столбцах матрицы arrayValues.
        Например, если arrayValues:

        3 1 3
        2 4 3
        5 4 2

        То полученный массив должен содержать суммы значений для каждого столбца:
        10 9 8

        Верните полученный массив используя ключевое слово return.
         *//*
    }

    private static void sort(int[] array) {
        //Отсортируйте массив array с помощью алгоритма "сортировки выбором".
    }

    public static void main(String[] args) {
        level1();
        level2();
        level3();*/
    //}

            //}
