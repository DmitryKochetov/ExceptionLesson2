// 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен сумме элементов двух 
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
// как-то оповестить пользователя.

package DZ;

public class task2 {
    public static void main(String[] args) {
        Integer[] arrayForSum1 = { 1, 1, 2, 4, 6, 4 };
        Integer[] arrayForSum2 = { 2, 2, 3, 5, 7, 5, 2 };

        printArray(sumArray(arrayForSum1, arrayForSum2));
    }

    public static Integer[] sumArray(Integer[] arr1, Integer[] arr2) {
        Integer[] resultList = new Integer[arr1.length];
        if (arr1.length != arr2.length) {
            System.out.println("длины массивов не равны");
            return new Integer[0];
        } else {
            for (int i = 0; i < resultList.length; i++) {
                resultList[i] = arr1[i] + arr2[i];
            }
        }
        return resultList;

    }

    public static void printArray(Integer[] arr) {
        if (arr.length == 0) {
            System.out.println("Печать невозможна");

        } else {
            for (Integer e : arr) {
                System.out.printf("%d\t", e);
            }
            System.out.println();
        }
    }

}
