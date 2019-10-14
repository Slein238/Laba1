package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int n;
        boolean isTrue = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        n = in.nextInt();
        Array1 x = new Array1(n);

        System.out.println("1.Ввод массива с клавиатуры.\n2.Ввод массива датчиком случайных чисел класса Math.");
        System.out.print("Выберете метод ввода: ");
        while (isTrue) {
            int num = in.nextInt();
            int max, min;
            switch (num) {
                case 1:
                    x.consoleInput();
                    isTrue = false;
                    break;
                case 2:
                    System.out.print("Введите min возможный элемент массива: ");
                    min = in.nextInt();
                    System.out.print("Введите max возможный элемент массива: ");
                    max = in.nextInt();
                    x.randomInput(min, max);
                    isTrue = false;
                    break;
                default:
                    System.out.print("Нажмите 1 для ввода массива с клавиатуры или нажмите 2 для ввода массива датчиком случайных чисел класса Math.: ");
            }
        }
        x.consoleOut();
        x.invertedСonsoleOut();

        System.out.print("\nВведите число для сравнения: ");
        int a = in.nextInt();
        x.check(a);

        x.sort();
        System.out.print("Отсортированный ");
        x.consoleOut();
    }
}