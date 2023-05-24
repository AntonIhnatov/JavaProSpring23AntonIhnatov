package main.java.HW1PrimitivesAndReferenceDataTypes;

public class HW1 {
    public static void main(String[] args) {
        //Створити по 1 екземпляру кожного примітивного типу
        byte byteVariable = 10;
        short shortVariable = 20;
        char charVariable = '1';
        int intVariable = 30;
        long longVariable = 40L;
        double doubleVariable = 3.14159;
        float floatVariable = 3.14f;
        boolean booleanVariable = true;

        int c = (int)charVariable;
        System.out.println("Номер символу 1 за таблицею Unicode - " + c);

        System.out.println("------------------------------------");

        //Створити строку двома способами
        String stringFirst = "String first method";
        String stringSecond = new String("String second method");

        //Написати по 2 арифметичні операції з кожною змінною та вивести результат
        System.out.println("Byte + 5 = " + (byteVariable + 5));
        System.out.println("Byte - 5 = " + (byteVariable - 5));

        System.out.println("Short * 2 = " + (shortVariable * 2));
        System.out.println("Short / 2 = " + (shortVariable / 2));

        System.out.println("Int + 10 = " + (intVariable + 10));
        System.out.println("Int - 10 = " + (intVariable - 10));

        System.out.println("Long * 2 = " + (longVariable * 2));
        System.out.println("Long / 2 = " + (longVariable / 2));

        System.out.println("Float + 1.0 = " + (floatVariable + 1.0f));
        System.out.println("Float - 1.0 = " + (floatVariable - 1.0f));

        System.out.println("Double * 2 = " + (doubleVariable * 2));
        System.out.println("Double / 2 = " + (doubleVariable / 2));

        System.out.println("Char + 1 = " + (charVariable + 1));
        System.out.println("Char - 1 = " + (charVariable - 1));

        System.out.println("---------------------------------------------------------------");
        //Написати по 2 реляцонні та логічні операції кожного типу та вивести результат, написати 2 тернарні операції та вивести результат
        int a = 10;
        int b = 5;
        boolean x = true;
        boolean y = false;

        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println(x || y);
        System.out.println(x && y);

        int result1 = (a > b) ? a : b;
        String result2 = (x || y) ? "x OR y is true" : "Neither x nor y is true";

        System.out.println(result1);
        System.out.println(result2);

        System.out.println("-------------------------------------------------------------");
        //Створити змінну 1 та використовуючи інкремент та декремент вивести
        int num1 = 1;
        System.out.println(num1++);
        System.out.println(--num1);
        System.out.println(num1--);
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(--num1);
        System.out.println(num1--);

        System.out.println("-------------------------------------------------------");
        //Створити одномірний масив на 10 елементів та заповнити його будь-якими значеннями. Вивести парні числа
        int[] arr = {2, 5, 8, 13, 20, 12, 16, 7, 9, 4};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
