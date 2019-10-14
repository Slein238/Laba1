package com.company;
import java.util.Scanner;

public class Array1 {
    private int n;
    private int[] arr;


    public Array1(int n)throws Exception{
        if (n <= 0)
            throw new Exception(new String("количество элементов должно быть больше 0"));
        this.n = n;
        arr = new int [n];
    }


    public void randomInput(int min, int max){
        for(int i = 0; i < n; i++)
            arr[i]=(int)(min+(Math.random()*(max-min)));
    }


    public void consoleInput(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Введите arr[" + i + "] = ");
            arr[i] = in.nextInt();
        }
    }


    public void consoleOut(){
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


    public void invertedСonsoleOut(){
        System.out.print("\nМассив в обратном порядке: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }


    public void check(int s){
        int max, res;
        res = 0;
        max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                res += 1;
            }
        }
        if (res > s)
            System.out.println("максимальное число встретилось больше чем " + s + " раз(а)");
        else
            System.out.println("максимальное число встретилось не больше чем " + s + " раз(а)");
    }


    public void sort(){
        int index = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < n; j++){
                if (arr[j] % 10 == i){
                    int tmp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = tmp;
                    index = index + 1;
                }
            }
        }
    }
}