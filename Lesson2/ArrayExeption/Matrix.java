package HW;

import java.util.Scanner;

public class Matrix {

    public void arrayExeption() {
        String s;
        Scanner sc = new Scanner(System.in);

        // размерности массива
        int i;
        int j;

        System.out.println("Введите размерность двумерного массива");
        i = sc.nextInt();
        System.out.println("Введите размерность двумерного массива");
        j = sc.nextInt();


        String[][] matrix = new String[i][j];

        // заполнение массива
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix.length; l++) {
                System.out.println("Введите элемент массива: ");
                matrix[k][l] = sc.next();
                s = matrix[k][l];
            }

        }

        try {
            System.out.println("сумма элементов массива" + sumMatrix(matrix));
        } catch (MyArraySizeExeption e){
            e.printStackTrace();
        } catch (MyArrayDataExeption e) {
            e.printStackTrace();
        }
    }

    //подсчет суммы элементов массива
    public static int sumMatrix(String[][] mass) throws MyArrayDataExeption, MyArraySizeExeption {
        int sum = 0;

//проверка длины массива
        if (mass.length != 4) {
            throw new MyArraySizeExeption("Выход за пределы массива");
        }
        // проверка ошибки преобразования
try {
    for (int i = 0; i < mass.length; i++) {
        for (int j = 0; j < mass.length; j++) {
            sum += Integer.parseInt(mass[i][j]);
        }
    }
} catch (NumberFormatException e){
           throw new MyArrayDataExeption("Неверный формат данных");
}

        return sum;
    }
}
