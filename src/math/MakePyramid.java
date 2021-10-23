package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *


        //implementation here...
        int level = 6;
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < level - i; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s<= i; s++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
