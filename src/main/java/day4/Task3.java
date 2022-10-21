/*Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
*/
package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int [][] twoD = new int[m][n];
        Random rand = new Random();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                twoD[i][j] = rand.nextInt(51);
                System.out.print("["+twoD[i][j]+"] ");
            }
            System.out.println();
        }


        int sum;
        int [] allsums = new int [m];
        int max = allsums[0];
        for(int i = 0; i < m; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                sum += twoD[i][j];
            }
            allsums [i] = sum;
        }

        int line = 0;
        for(int i = 0; i < allsums.length; i++){
            int compareTo = allsums[i];
            if(max < compareTo){
                max = compareTo;
                line = i;
            }
        }
        System.out.println(Arrays.toString(allsums));
        System.out.println(max);
        System.out.println(line);
    }
}
