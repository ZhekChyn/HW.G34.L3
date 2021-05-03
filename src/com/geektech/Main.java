package com.geektech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

            // Основное домашнее задание
                       //0    1   2    3    4   5   6   7    8     9   10  11   12    13   14
        double[] num = {1.0,-2.5,5.7,-0.2,-4.3,7.0,9.8,6.5,-13.1,10.3,12.4,3.3,13.5,15.7,18.8};

        // определение первого отрицательного числа путем вывода всей строки массива 'num'
        System.out.println(Arrays.toString(num));


        // сумма всех положительных чисел после первого отрицательного числа массива 'num'
        double sum = num[2]+num[5]+num[6]+num[7]+num[9]+num[10]+num[11]+num[12]+num[13]+num[14];

        // среднее арифметическое положительных чисел расположенных после первого отрицательного числа
        System.out.println(sum / 10);


        // Дополнительное домашнее задание
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        }



    }
