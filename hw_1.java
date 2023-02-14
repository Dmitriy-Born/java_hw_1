import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// 2. Вычислить n! (произведение чисел от 1 до n)
// 3.  Вывести все простые числа от 1 до 1000
// 4.  Реализовать простой калькулятор
// 5*. Задано уравнение вида q + w = e, q, w, e >= 0.
//     Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
//     Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение 
//     или сообщить, что его нет.

public class hw_1 {
    public static void main(String[] args) {
        System.out.println("Введите номер задания: ");
        int ex = new Scanner(System.in).nextInt();
        switch (ex){
            case (1):
                //Ex_1
                System.out.println("Задание № 1");
                System.out.print("Введите число: ");
                int num1 = new Scanner(System.in).nextInt();
                System.out.println("Сумма n первых натуральных чисел до заданного = " + numberSum(num1));
            break;

            case(2):
                //Ex_2
                System.out.println("Задание №2");
                System.out.print("Введите число: ");
                int num2 = new Scanner(System.in).nextInt();
                System.out.printf("%d! = %d\n", num2, fact(num2));
            break;

            case (3):
                System.out.println("Задание №3");
                System.out.print("Введите число: ");
                int num3 = new Scanner(System.in).nextInt();
                System.out.printf("Простые числа до числа %d: %s\n", num3, simpleNumber(num3));
            break;

            case (4):
                System.out.println("Задание №4");

                System.out.print("Введите первое число: ");
                Double num41 = new Scanner(System.in).nextDouble();

                System.out.print("Введите оператор: ");
                Scanner op = new Scanner(System.in);
                char oper = op.next().charAt(0);

                System.out.print("Введите второе число: ");
                Double num42 = new Scanner(System.in).nextDouble();

                System.out.printf("Результатом выражения %.2f %c %.2f = %.2f\n",num41,oper,num42,calc(num41, num42, oper));
            break;
            default:
                System.out.println("Такого задания не делали");
                }//switch
    }




    public static int numberSum(int n) {   // Задание 1
        int number = 1;
                for (int i = 2; i <= n; i++) {
                    number += i;
                }
                return number;
    }

    public static int fact(int n) { // задание 2
        if (n == 0 || n == 1){
            return 1;
        }
        return fact(n-1)*n;
    }

    public static StringBuilder simpleNumber(int n) { // Задание 3
        StringBuilder strBuffer = new StringBuilder();
        if (n >= 2){
            strBuffer.append(2);
            strBuffer.append("  ");
        for (int i = 3; i <= n; i = i + 2) {
            if (i == 3){
                strBuffer.append(3);
                strBuffer.append("  ");
            }
            if (i == 5){
                strBuffer.append(5);
                strBuffer.append("  ");
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                strBuffer.append(String.valueOf(i));
                strBuffer.append("  ");
            }
            }    
        }
        return strBuffer;
    }


    public static double calc(Double num1, Double num2, char p) { //Задание 3
        double result = 0;
        if (p == '+'){
            result = num1 + num2;
        }
        if (p == '-'){
            result = num1 - num2;
        }
        if (p == '/'){
            result = num1 / num2;
        }
        if (p == '*'){
            result = num1 * num2;
        }
        return result;
    }
}