package usta.sistemas;

import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
	/*Author: Jhon Alexis Piracoca Arcos
	 *Date. 12/03/2020
	 * Description: This software realize many mathematic operations with four numbers, two int and tow double

	 */
	Scanner keyboard = new Scanner(System.in);
	int x, y,sum_int , dif_int, product_int, divide_int, rest_int, x_double, y_double ;
	double m, n, sum_double, dif_double, product_double, divide_double, rest_double, sum_int_double, sum_int_double_2 ;
	double dif_int_double, dif_int_double_2, divide_int_double, divide_int_double_2, m_double, n_double, sum_all, product_all;

        System.out.println("This software realize many mathematic operations with four numbers, two integers and tow decimals, Input the fist variable integer");
        x = keyboard.nextInt();
        System.out.println("Input the second variable integer");
        y = keyboard.nextInt();
        System.out.println("Input the first variable decimal");
        m = keyboard.nextDouble();
        System.out.println("Input the second variable decimal ");
        n = keyboard.nextDouble();

        sum_int = x + y;
        System.out.println("The sum of the integers is: " + sum_int);

        dif_int = x - y;
        System.out.println("The difference of the first integer and the second integer is: " + dif_int);

        product_int = x * y;
        System.out.println("The product of the integers is: " + product_int);

        divide_int = x/y;
        System.out.println("The division of the first integer between the second integer, is: " + divide_int);

        rest_int = x % y;
        System.out.println("The rest between the first integer and the second integer is: " + rest_int);

        sum_double = m + n;
        System.out.println("The sum of the decimals is. " + sum_double);

        dif_double = m - n;
        System.out.println("The difference between the decimals is: " + dif_double);

        product_double = m * n;
        System.out.println("The product of the decimals is: " + product_double);

        divide_double = m/n;
        System.out.println("The division between the first decimal between the second decimal is: " + divide_double);

        rest_double = m % n;
        System.out.println("The rest between the first decimal between the second decimal is: " + rest_double);

        sum_int_double = x + n;
        System.out.println("The sum of the first integer and the second decimal is: " + sum_int_double);

        sum_int_double_2 = y + m;
        System.out.println("The sum between the second integer and the fist decimal is: " + sum_int_double_2);

        dif_int_double = x - n;
        System.out.println("The difference between the first integer and the second decimal is: " + dif_int_double);

        dif_int_double_2 = y/m;
        System.out.println("The difference between the second integer and the first decimal is: " + dif_int_double_2);

        divide_int_double = x/n;
        System.out.println("The division between the fist integer and the second decimal is: " + divide_int_double);

        divide_int_double_2 = y/m;
        System.out.println("The division between the second integer and the first decimal is: " + divide_int_double_2);

        x_double = x * 2;
        System.out.println("The double of the first integer is: " + x_double);

        y_double = y * 2;
        System.out.println("The double of the second integer is: " + y_double);

        m_double = m * 2;
        System.out.println("The double of the first decimal is: " + m_double);

        n_double = n * 2;
        System.out.println("The double of the second decimal is: " + n_double);

        sum_all = x + y + m + n;
        System.out.println("The sum of all variables is: " + sum_all);

        product_all = x * y * m * n;
        System.out.println("The product of all variables is: " + product_all);

        System.out.println("Thanks for use this this software, created by Juan David Amézquita Núñez");




    }
}
