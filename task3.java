// 3*. Реализуйте метод, принимающий в качестве аргументов двумерный массив. 
// Метод должен проверить что длина строк и столбцов с одинаковым индексом 
// одинакова, детализировать какие строки со столбцами не требуется.

package DZ;

import java.util.IntSummaryStatistics;

public class task3 {
    public static void main(String[] args) {
        Integer[][] arrayForCheck = {
                { 1, 1 },
                { 2, 4 },
                { 4 }
        };
        checkArray(arrayForCheck);
    }

    public static void checkArray(Integer[][] array) {
        // System.out.println(array.length);
        // System.out.println(array[0].length);
        // System.out.println(array[1].length);
        Integer[] arrayOfRowsLength = new Integer[array.length];
        Integer[] arrayOfColumsLength = new Integer[array[0].length];

        for (int i = 0; i < arrayOfRowsLength.length; i++) {
            arrayOfRowsLength[i] = array[i].length;
        }

        for (Integer i : arrayOfRowsLength) {
            System.out.printf("%d\t", i);
        }

        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i][i]);
        // }

    }

}
