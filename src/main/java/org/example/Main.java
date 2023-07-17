package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.println("Sayı girin :");
        int number = scanner.nextInt();
        int sumOfEvenAndMultiplesOf4 = 0;

        while(number % 2 ==  0){
            if (number % 2 == 0 || number % 4 == 0) {
                sumOfEvenAndMultiplesOf4 += number;
            }
            System.out.println("Sayı girin :");
            number = scanner.nextInt();
        }
        System.out.println("Çift ve 4'e bölünebilen sayıların toplamı : " + sumOfEvenAndMultiplesOf4);
    }
}