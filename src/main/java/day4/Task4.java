/*Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов.
Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.

Пример:
*Для простоты пример показан на массиве размера 10

[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

Тройка с максимальной суммой: [8742, 1040, 3254]

Вывод в консоль:
13036
7

*Пояснение. Первое число - сумма тройки [8742, 1040, 3254].
Второе число - индекс первого элемента тройки, то есть индекс числа 8742.*/

package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int size = 10;
        int [] array = new int[size];
        Random random = new Random();
        for (int a = 0; a < array.length; a++){
            array [a] = random.nextInt(10001);
        }

        int [] sums = new int[size - 3];
        int sum;
        for (int i = 0; i < size-3; i++){
            sum = array[i] + array[i+1] + array[i+2];
            sums [i] = sum;
        }
        System.out.println(Arrays.toString(sums));
        int max = sums[0];
        int maxIndex = 0;
        for(int j = 0; j < sums.length; j++){
            if(max < sums[j]){
                max = sums[j];
                maxIndex = j;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
