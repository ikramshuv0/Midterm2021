package math;

import java.sql.SQLOutput;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {


    public static void main(String[] args) {
//        /*
//         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
//         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
//         *
//         */
        //implementation here...
         int s;
         int fac = 1;
         int num = 4;



        for (s = 1; s <= num; s++) {
            fac = fac * s;
        }
        System.out.println("Factorial of " + num + " is: " + fac);

        System.out.println("Factorial of 6 is: " + factorial(6));

    }
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }




}



