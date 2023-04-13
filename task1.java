// 1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве
// аргумента целочисленный
// одномерный массив. Метод должен пройтись по каждому элементу и проверить что
// он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
// пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их
// “подсветить”

package DZ;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {

        Integer[] arrayForCheck = { 1, 1, null, 2, 4, 6, 4, null, null };

        checkArray(arrayForCheck);

        printArray(arrayForCheck);

    }

    public static void checkArray(Integer[] arr) {
        ArrayList<Integer> listForNullIndexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                listForNullIndexes.add(i);
            }
        }
        System.out.println("Элементы с индексами " + listForNullIndexes.toString() + " равны нулю");
    }

    public static void printArray(Integer[] arr) {
        for (Integer e : arr) {
            System.out.printf("%d\t", e);
        }
        System.out.println();
    }

}

// import java.util.Random;

// public class heapSort {
// private static final Random random = new Random();

// public static void main(String[] args) {
// int[] arr = ArrayUtils.prepareArray();
// ArrayUtils.printArray(arr);
// Sort(arr);
// ArrayUtils.printArray(arr);
// }

// static class ArrayUtils {
// private static int[] prepareArray() {
// int[] arr = new int[random.nextInt(16) + 5];
// for (int i = 0; i < arr.length; i++) {
// arr[i] = random.nextInt(101) - 50;
// }
// return arr;
// }

// static int[] prepareArray(int length) {
// int[] arr = new int[random.nextInt(16) + 5];
// for (int i = 0; i < arr.length; i++) {
// arr[i] = random.nextInt(101) - 50;
// }
// return arr;
// }

// static void printArray(int[] arr) {
// for (int e : arr) {
// System.out.printf("%d\t", e);
// }
// System.out.println();
// }
// }

// static void Sort(int[] arr) {
// for (int i = arr.length / 2 - 1; i >= 0; i--) {
// findMax(arr, arr.length, i);
// }

// for (int i = arr.length - 1; i >= 0; i--) {
// int temp = arr[0];
// arr[0] = arr[i];
// arr[i] = temp;
// findMax(arr, i, 0);
// }
// }

// static void findMax(int[] arr, int heapsize, int rootIndex) {1
// int max = rootIndex;
// int childLeft = max * 2 + 1;
// int childRight = max * 2 + 2;
// if (childLeft < heapsize && arr[childLeft] > arr[max]) {
// max = childLeft;
// }
// if (childRight < heapsize && arr[childRight] > arr[max]) {
// max = childRight;
// }
// if (max != rootIndex) {
// int temp = arr[rootIndex];
// arr[rootIndex] = arr[max];
// arr[max] = temp;
// findMax(arr, heapsize, max);
// }

// }

// }
