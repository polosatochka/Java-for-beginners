/* Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя цикл for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

Рекомендация:
Для поиска наибольшего и наименьшего элемента массива переменные,
которые будут хранить эти значения необходимо либо инициализировать уже после заполнения массива,
первым элементом этого массива
max =arr[0]
min = arr{0]
либо до массива, но самым "крайним" числом в диапазоне, т.е.
max = Integer.MIN_VALUE
min = Integer.MAX_VALUE
Это максимально универсальный подход.
*/
package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10001);
        }
        int max = arr[0];
        int min = arr[0];
        int counter = 1;

        for(int num : arr){
            if(max < arr[counter]){
                max = arr[counter];
                counter++;
            }
        }
        System.out.println("наибольший элемент массива: " + max);

        for(int number : arr){
            if(min > arr[counter]){
                min = arr[counter];
                counter++;
            }
        }
        System.out.println("наименьший элемент массива: " + min);

        int numsendzero = 0;
        int sum = 0;
        for (int s : arr){
            if(s%10 == 0){
                numsendzero++;
                sum+=s;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + numsendzero);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
