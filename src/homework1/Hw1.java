package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int a = 166;
        int b = 38;

        while (b != 0) {
            int с = a%b;
            a = b;
            b = с;
        }
        System.out.println(a);

        // Задание 2
        System.out.println("Задание 2");

        int[] testArr = {37,51,532,532,4,32,41,32,31,2,3,12,-11};
        Arrays.sort(testArr);
        for (int i = 0; i < testArr.length; i++) {
             int summ = 7;
             int num1 = testArr[i];
             int num2 = summ - num1;
             int index = Arrays.binarySearch(testArr,num2);
             if (index >= 0 && index != i) {
                 System.out.println("сумма = " + num1 + "+" + num2);
             }
        }

        // Задание 3
        System.out.println("Задание 3");
        int n = 10;
        int[] testArr2 = new int[n];
        for (int i = 0; i < testArr2.length; i++) {
            testArr2[i] = (int)  (Math.random() * n);
        }
        int max = 0;
        int min = 0;
        int avg = 0;
        int sum = 0;
        for (int i = 0; i <testArr2.length ; i++) {

            if (max < testArr2[i]) {
                max = testArr2[i];
            }
            if (min > testArr2[i]){
                min = testArr2[i];
            }
            sum += testArr2[i];
            avg = sum / testArr2.length;
        }
        System.out.println(Arrays.toString(testArr2));
        System.out.println("максимальное = " + max);
        System.out.println("минимальное = " + min);
        System.out.println("среднее = " + avg);



        //Задание 4
        System.out.println("Задание 4");
        Scanner in = new Scanner(System.in);
        System.out.println("введите целое число больше 3");
        int someNum = in.nextInt();
        if (someNum < 3){
            System.out.println("Введено не верное число, повторите ввод");
        }
        else {
            int[] testArr4 = new int[someNum];
            for (int i = 0; i < testArr4.length; i++) {
                 testArr4[i] = (int) (Math.random() * someNum);
            }
            System.out.println(Arrays.toString(testArr4));
            int[] resultArr = new int[testArr4.length];
            for (int i = 0; i < testArr4.length; i++) {
                if (testArr4[i] % 2 == 0) {
                    resultArr[i] = testArr4[i];
                }

            }
            System.out.println(Arrays.toString(resultArr));
        }
    //задание 5
        System.out.println("Задание 5");
        int[] [] newArr = new int[5][8];
        int max1 = newArr[0][0];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = (int) ((Math.random()*199)-99);
            }
            for(int i1 = 0; i1 < newArr.length; i1++) {
                for(int j1 = 0; j1 < newArr[i].length; j1++) {
                    if(newArr[i1][j1] > max1)
                        max1 = newArr[i1][j1];
                }
            }
        }
        System.out.println(Arrays.deepToString(newArr));
        System.out.println("Максимальный элемент массива = " + max1);




    }
}
