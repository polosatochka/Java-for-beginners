/*
1. С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46
*/

package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];

        Random rand = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(11);
        }
        for(int a :  array){
            System.out.print("["+ a +"] ");
        }
        System.out.println(" ");
        System.out.println("Длина массива: " + n);

        int morethaneight = 0;
        for(int b :  array){
            if(b > 8){
                morethaneight++;
            }
        }
        System.out.println("Количество чисел больше 8: " + morethaneight);

        int equalsone = 0;
        for(int c :  array){
            if(c == 1){
                equalsone++;
            }
        }
        System.out.println("Количество чисел равных 1: " + equalsone);

        int evennumber = 0;
        for(int d : array){
            if(d % 2 == 0){
                evennumber++;
            }
        }
        System.out.println("Количество четных чисел: " + evennumber);

        int unevennumber =0;
        for(int e : array){
            if(e % 2 != 0){
                unevennumber++;
            }
        }
        System.out.println("Количество нечетных чисел: " + unevennumber);

        int sum = 0;
        for(int s : array){
            sum +=s;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
