package ru.javalang.module03.tasks.t01;

import java.util.Scanner;

/**
 *
 * Ввести число, и выяснить -
 * положительное оно, отрицательное, или равно нулю?
 *
 */

public class Main {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Определение положительное число, отрицательное, или равно нулю.\nВведите целое число: ");

        int InInt = Scanner.nextInt();
     //   String ResultStr ;
       ;

        // switch (InInt ) {
         //   case InInt = 0; ResultStr -> "Ноль";
            //case InInt > 0  ResultStr -> "Больше 0";
            //case InInt < 0  ResultStr  -> "Меньше 0";
            //default ResultStr  -> "Не опредленно!";
        //};
        System.out.println("Введено число " + InInt + ", результат " );

    }
}
