package ru.krista.example;

import java.util.Scanner;

public class Calculator {
    int rez, num1 = 0, num2 = 0;
    String znak;

    public void GetLine() {
        String stroka;
        Scanner in;
        System.out.print("Введите выражение: ");
        in = new Scanner(System.in);
        stroka = in.nextLine();
        String[] parts = stroka.split(" ");
        try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
            znak = parts[1];
        } catch (Exception e) {
            System.out.println("Не число");
            System.exit(1);

        }

        in.close();

    }

    public void Plus() {
        rez = num1 + num2;
        System.out.printf("Результат сложения: %d\n", rez);
    }

    public void Minus() {
        rez = num1 - num2;
        System.out.printf("Результат вычитания: %d\n", rez);
    }

    public void Umnozhit() {
        rez = num1 * num2;
        System.out.printf("Результат умножения: %d\n", rez);
    }

    public void Razdelit() {
        if (num2 == 0) {
            System.out.print("Error! Деление на 0\n");
            System.exit(1);
        
        rez = num1 / num2;
        System.out.printf("Результат деления: %d\n", rez);
        
    }

    public void Calk() {
        switch (znak) {
            case "+": {
                Plus();
                break;
            }
            case "-": {
                Minus();
                break;
            }
            case "*": {
                Umnozhit();
                break;
            }
            case "/": {
                Razdelit();
                break;
            }
            default:
                System.out.print("Error! Неправильный ввод знака!\n");
                break;
        }
    }
}
