/*Написать программу которая будет сравнивать величину (magnitude) двух чисел. Например,
        если одно число = 3, а второе число = -9, программа должна выдать, что число -9 имеет
        большую величину.*/
package lesson_3;

public class ComparisonOfNumbersMagnitude {
    public static void main(String[] args) {

        int x = -50;
        int y = 20;

        if (x != y) {

            x = x < 0 ? -x : x;
            y = y < 0 ? -y : y;

            System.out.println(x);
            System.out.println(y);

            if (x > y) {
                    System.out.println("The number x has the geatest value");

            } else {
                    System.out.println("The number y has the geatest value");
            }

        } else {
                System.out.println("The numbers are equal");
        }
    }
}
