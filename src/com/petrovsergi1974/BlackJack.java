package com.petrovsergi1974;
/*
Напишите код, который в цикле спрашивает у пользователя число от 1 до 10 (по одному числу за раз),
до тех пор, пока сумма этих чисел не станет равной 21.
Если сумма чисел превысила 21, то завершите программу.
Если сумма чисел составила точно 21, то поздравьте пользователя с выигрышем.
Например, пользователь ввел число 2, затем число 5, затем число 6, их сумма будет
2 + 5 + 6 = 13
 */
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Упражнение 3");
        System.out.println("Наберите сумму чисел равную 21 (или введите 0 для завершения)");

        int sum = 0;
        int userNumber;

        while (sum != 21) {
            System.out.print("Введите число: ");
            userNumber = scanner.nextInt();
            if (userNumber == 0) {
                break;
            }
            if (userNumber < 0 || userNumber > 10) {
                System.out.println("Нужно ввести число от 0 до 10");
            } else {
                sum += userNumber;
            }
            System.out.println("Сумма равна " + sum);
            if (sum > 21) {
                break;
            }
        }

        if (sum == 21) {
            System.out.println("Сумма набрана");
        } else {
            System.out.println("Попробуйте выиграть в следующий раз");
        }
    }
}
