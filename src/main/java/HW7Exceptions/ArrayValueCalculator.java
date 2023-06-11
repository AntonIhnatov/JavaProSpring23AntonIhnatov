package main.java.HW7Exceptions;

public class ArrayValueCalculator {
    public static void main(String[] args) {
     String [][] array = {
             {"1", "2", "3", "4"},
             {"5", "3", "7", "8"},
             {"9", "10", "24", "12"},
             {"13", "14", "15", "16"}
     };

        String [][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "5", "7", "g"},
                {"9", "10", "24", "12"},
                {"13", "14", "15", "23"}
        };

        String [][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "3", "7", "8"},
                {"9", "10", "24", "12"},
                {"13", "14", "15", "16"},
                {"13", "14", "15", "16"}
        };


     try {
         int result = doCalc(array);
         System.out.println("Результат: " + result);
     } catch (ArraySizeException ex){
         System.out.println("Помилка розміру масиву: " + ex.getMessage());
     } catch (ArrayDataException ex){
         System.out.println("Помилка даних масиву: " + ex.getMessage());
     }

        System.out.println("-----------------------------------------------------------------------");

        try {
            int result1 = doCalc(array1);
            System.out.println("Результат: " + result1);
        } catch (ArraySizeException ex){
            System.out.println("Помилка розміру масиву: " + ex.getMessage());
        } catch (ArrayDataException ex){
            System.out.println("Помилка даних масиву: " + ex.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------");

        try {
            int result2 = doCalc(array2);
            System.out.println("Результат: " + result2);
        } catch (ArraySizeException ex){
            System.out.println("Помилка розміру масиву: " + ex.getMessage());
        } catch (ArrayDataException ex){
            System.out.println("Помилка даних масиву: " + ex.getMessage());
        }


    }

    public static int doCalc(String [][] array) throws ArraySizeException, ArrayDataException{
        int sumOfArray = 0;

        if (array.length !=4){
            throw new ArraySizeException("розмір масиву має бути 4x4");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sumOfArray += value;
                } catch (NumberFormatException ex ){

                    throw new ArrayDataException("невірні дані в комірці [" + i + "]" + "[" + j +"]");
                }
            }
        }
        return sumOfArray;
    }
}
