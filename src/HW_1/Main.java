package HW_1;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class Main {
    //Задание 2
    public static void main(String[] args) {
        byte a = 15;
        short b = 155;
        int c = 555;
        long d = 155555L;
        float e = 15.55f;
        double f = 15.55;
        char g = '\u2242';
        boolean h = true;
        System.out.println("Значение типа byte это " + a);
        System.out.println("Значение типа short это " + b);
        System.out.println("Значение типа int это " + c);
        System.out.println("Значение типа long это " + d);
        System.out.println("Значение типа float это " + e);
        System.out.println("Значение типа double это " + f);
        System.out.println("Значение типа char это " + g);
        System.out.println("Значение типа boolean это " + h);

        System.out.println("Метод вычисляющий выражение a * (b + (c / d))=" + sum(15, 5, 15, 5));
        System.out.println("Метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно)\n" + four(5, 5));
        minusPlus(0);
        System.out.println("Метод должен вернуть true, если число отрицательное\n" + minus(-10));
        name("Джеймс Гослинг");
        years(2020);
    }

    //Задание 3
    static int sum(int a, int b, int c, int d) {
        System.out.println("№3");
        return a * (b + (c / d));
    }

    //Второй вариант задания 3.
/*        int a = 20;
        int b = 2;
        int c = 12;
        int d = 3;
        int f = a * (b + (c / d));
        System.out.println(f);
 */
// Задание 4
    static boolean four(int a, int b) {
        System.out.println("№4");
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 5
    static void minusPlus(int a) {
        System.out.println("№5");
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    //Задание 6
    static boolean minus(int a) {
        System.out.println("№6");
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 7
    static void name(String name) {
        System.out.println("№7\nМетод, которому в качестве параметра передается строка, обозначающая имя");
        System.out.println("Привет, " + name + "!");
    }

    //Задание 8
    static void years(int y) {
        System.out.println("№8\nМетод, который определяет является ли год високосным, и выводит сообщение в консоль");
        if (!(y % 4 == 0) || ((y % 100 == 0) && !(y % 400 == 0))){
            System.out.println(y + " год не високосный");
        } else {
            System.out.println(y + " год високосный");
        }
    }
}